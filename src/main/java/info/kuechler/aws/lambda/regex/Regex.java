package info.kuechler.aws.lambda.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Regex implements RequestHandler<RequestClass, ResponseClass> {

    public ResponseClass handleRequest(RequestClass input, Context context) {
        final ResponseClass result = new ResponseClass();
        final List<ResponseItem> items = new ArrayList<>();
        result.setItems(items);

        int flags = 0;
        for (final Flags flag : nonNull(input.getFlags())) {
            flags |= flag.getFlag();
        }
        result.setFlags(input.getFlags());

        final Pattern pattern = Pattern.compile(input.getPattern(), flags);
        result.setPattern(pattern.pattern());

        result.setReplacement(input.getReplacement());
        for (final String text : nonNull(input.getTexts())) {

            final ResponseItem item = new ResponseItem();
            items.add(item);
            item.setText(text);

            item.setSplits(Arrays.asList(pattern.split(text)));

            final Matcher matcher = pattern.matcher(text);

            if (isNotEmpty(input.getReplacement())) {
                matcher.reset();
                item.setReplaceAll(matcher.replaceAll(input.getReplacement()));

                matcher.reset();
                item.setReplaceFirst(matcher.replaceFirst(input.getReplacement()));
            }
            matcher.reset();
            item.setMatches(matcher.matches());

            matcher.reset();
            item.setLookingAt(matcher.lookingAt());
            if (item.isLookingAt()) {
                item.setLookingAtMatch(getMatch(matcher));
            }

            matcher.reset();
            final List<ResponseMatch> finds = new ArrayList<>();
            item.setFinds(finds);
            while (matcher.find()) {
                finds.add(getMatch(matcher));
            }
        }

        return result;
    }

    private ResponseMatch getMatch(final Matcher matcher) {
        final ResponseMatch match = new ResponseMatch();
        match.setGroupCount(matcher.groupCount());
        final List<ResponseMatchItem> matches = new ArrayList<>();
        match.setMatches(matches);
        for (int i = 0; i <= matcher.groupCount(); i++) {
            final ResponseMatchItem matchItem = new ResponseMatchItem();
            matchItem.setStart(matcher.start(i));
            matchItem.setEnd(matcher.end(i));
            matchItem.setText(matcher.group(i));
            matchItem.setNumber(i);
            matches.add(matchItem);
        }
        return match;
    }

    private <I> Collection<I> nonNull(final Collection<I> source) {
        return source == null ? Collections.emptyList() : source;
    }

    private boolean isNotEmpty(final String s) {
        return s != null && !"".equals(s);
    }
}

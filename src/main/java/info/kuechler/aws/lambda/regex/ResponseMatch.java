package info.kuechler.aws.lambda.regex;

import java.util.List;

public class ResponseMatch {

    private int groupCount;

    private List<ResponseMatchItem> matches;

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public List<ResponseMatchItem> getMatches() {
        return matches;
    }

    public void setMatches(List<ResponseMatchItem> matches) {
        this.matches = matches;
    }
}

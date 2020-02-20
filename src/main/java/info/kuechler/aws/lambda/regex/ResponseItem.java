package info.kuechler.aws.lambda.regex;

import java.util.List;

public class ResponseItem {

    private String replaceAll;

    private String replaceFirst;

    private String text;

    private boolean matches;

    private boolean lookingAt;

    private ResponseMatch lookingAtMatch;

    private List<ResponseMatch> finds;

    private List<String> splits;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReplaceAll() {
        return replaceAll;
    }

    public void setReplaceAll(String replaceAll) {
        this.replaceAll = replaceAll;
    }

    public String getReplaceFirst() {
        return replaceFirst;
    }

    public void setReplaceFirst(String replaceFirst) {
        this.replaceFirst = replaceFirst;
    }

    public boolean isMatches() {
        return matches;
    }

    public void setMatches(boolean matches) {
        this.matches = matches;
    }

    public boolean isLookingAt() {
        return lookingAt;
    }

    public void setLookingAt(boolean lookingAt) {
        this.lookingAt = lookingAt;
    }

    public ResponseMatch getLookingAtMatch() {
        return lookingAtMatch;
    }

    public void setLookingAtMatch(ResponseMatch lookingAtMatch) {
        this.lookingAtMatch = lookingAtMatch;
    }

    public List<ResponseMatch> getFinds() {
        return finds;
    }

    public void setFinds(List<ResponseMatch> finds) {
        this.finds = finds;
    }

    public List<String> getSplits() {
        return splits;
    }

    public void setSplits(List<String> splits) {
        this.splits = splits;
    }
}

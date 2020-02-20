package info.kuechler.aws.lambda.regex;

import java.util.List;

public class ResponseClass {
    private List<ResponseItem> items;

    private String pattern;

    private List<Flags> flags;

    private String replacement;

    public List<ResponseItem> getItems() {
        return items;
    }

    public void setItems(List<ResponseItem> items) {
        this.items = items;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public List<Flags> getFlags() {
        return flags;
    }

    public void setFlags(List<Flags> flags) {
        this.flags = flags;
    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }
}

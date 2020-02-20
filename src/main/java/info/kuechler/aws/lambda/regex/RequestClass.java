package info.kuechler.aws.lambda.regex;

import java.util.List;

public class RequestClass {
    private String pattern;

    private String replacement;

    private List<String> texts;

    private List<Flags> flags;

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

    public List<String> getTexts() {
        return texts;
    }

    public void setTexts(List<String> texts) {
        this.texts = texts;
    }
}

package info.kuechler.aws.lambda.regex;

public class ResponseMatchItem {

    private String text;

    private int start;

    private int end;

    private int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

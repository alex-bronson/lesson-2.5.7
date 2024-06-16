package example.lesson_2_5_7;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int textLength;

    public TooLongTextAnalyzer(int textLength){
        this.textLength = textLength;
    }

    public Label processText(String text) {
        if (text.length() > textLength) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }
}

package example.lesson_2_5_7;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label = Label.SPAM;

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    protected String[] getKeywords() {
        return keywords;
    }
    protected Label getLabel() {
        return label;
    }
}

package example.lesson_2_5_7;

abstract class KeywordAnalyzer implements TextAnalyzer{
    abstract protected String[] getKeywords();
    abstract protected Label getLabel();

    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}

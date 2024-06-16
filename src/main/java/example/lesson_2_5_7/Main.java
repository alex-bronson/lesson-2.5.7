package example.lesson_2_5_7;

public class Main {
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer test: analyzers) {
            Label result;
            if ((result = test.processText(text)) != Label.OK){
                return result;
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        TextAnalyzer[] analyzers = new TextAnalyzer[]{
                new SpamAnalyzer(new String[]{"spam", "promotion"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(50)
        };

        String[] texts = {
                "This is a spam message",
                "I am so sad =(",
                "This comment is too long. It is longer than 50 characters. It is longer than 50 characters. It is longer than 50 characters. It is longer than 50 characters.",
                "This is a normal comment."
        };

        for (String text : texts) {
            Label result = checkLabels(analyzers, text);
            System.out.println("\nText: " + text + "\nResult: " + result);
        }
    }
}


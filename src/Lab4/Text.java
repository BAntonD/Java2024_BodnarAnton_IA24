package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences = new ArrayList<>();

    public Text(String text) {
        String cleanedText = text.replaceAll("\\s+", " ");
        String[] sentenceParts = cleanedText.split("(?<=[.!?])\\s*");
        for (String part : sentenceParts) {
            sentences.add(new Sentence(part));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence.toString()).append(" ");
        }
        return result.toString().trim();
    }
}


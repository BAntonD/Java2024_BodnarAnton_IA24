package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words = new ArrayList<>();
    private List<Character> punctuation = new ArrayList<>();

    public Sentence(String sentence) {
        // Розділення за словами та знаками пунктуації
        String[] parts = sentence.split("(?=[.,!?])|\\s+");
        for (String part : parts) {
            if (part.matches("[.,!?]")) {
                punctuation.add(part.charAt(0)); // Додаємо розділові знаки
            } else {
                Word word = new Word(part);
                if (!word.isEmpty()) { // Перевірка на порожнє слово
                    words.add(word);
                }
            }
        }
    }

    public List<Word> getWords() {
        return words;
    }

    public List<Character> getPunctuation() {
        return punctuation;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            result.append(words.get(i).toString());
            if (i < punctuation.size()) {
                result.append(punctuation.get(i));
            }
            if (i != words.size() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}


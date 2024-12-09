package Lab4;

import java.util.Arrays;

public class Word {
    private Letter[] letters;

    public Word(String word) {
        if (word == null || word.trim().isEmpty()) {
            // Якщо слово порожнє або містить лише пробіли, створюємо порожній масив
            letters = new Letter[0];
        } else {
            // Очистка від неалфавітних символів
            String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-ЯїЇіІєЄґҐ]", "");
            if (cleanedWord.isEmpty()) {
                // Якщо після очищення слово порожнє
                letters = new Letter[0];
            } else {
                // Створюємо масив літер
                this.letters = Arrays.stream(cleanedWord.split(""))
                        .map(c -> new Letter(c.charAt(0)))
                        .toArray(Letter[]::new);
            }
        }
    }

    public String toLowerCase() {
        return Arrays.stream(letters)
                .map(l -> Character.toLowerCase(l.getCharacter()))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public boolean isEmpty() {
        return letters.length == 0;
    }

    @Override
    public String toString() {
        return Arrays.stream(letters)
                .map(Letter::toString)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}

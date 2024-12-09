import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Lab2 {

    public static void main(String[] args) {
        try {
            // Створюємо BufferedReader для коректного зчитування введення
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
            System.out.println("Введіть текст:");
            String input = reader.readLine(); // Зчитуємо текст

            // Перетворення введеного тексту на StringBuffer
            StringBuffer textBuffer = new StringBuffer(input);

            // Обробка тексту: видалення повторів, залишення лише унікальних слів
            List<String> uniqueWords = getUniqueWords(textBuffer);

            // Виведення результату
            if (uniqueWords.isEmpty()) {
                System.out.println("Унікальних слів немає.");
            } else {
                System.out.println("Слова, що зустрічаються лише раз, у алфавітному порядку:");
                for (String word : uniqueWords) {
                    System.out.println(word);
                }
            }

        } catch (Exception e) {
            // Обробка виключних ситуацій
            System.err.println("Сталася помилка: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static List<String> getUniqueWords(StringBuffer textBuffer) {
        String[] wordsArray = textBuffer.toString().toLowerCase().split("[^\\p{L}\\p{N}]+");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : wordsArray) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        List<String> uniqueWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }

        Collections.sort(uniqueWords);
        return uniqueWords;
    }
}

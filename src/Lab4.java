import java.util.Scanner;
import Lab4.Text;
import Lab4.Word;
//import Lab4.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String input = scanner.nextLine();

        // Створення об'єкта Text
        Text text = new Text(input);

        // Вивід відформатованого тексту
        System.out.println("Відформатований текст:");
        System.out.println(text);
        System.out.println();


        // Обробка тексту для унікальних слів
        System.out.println("Слова, що зустрічаються лише раз, у алфавітному порядку:");
        text.getSentences().stream()
                .flatMap(sentence -> sentence.getWords().stream())
                .map(Word::toLowerCase)
                .filter(word -> text.getSentences().stream()
                        .flatMap(s -> s.getWords().stream())
                        .map(Word::toLowerCase)
                        .filter(w -> w.equals(word))
                        .count() == 1)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}

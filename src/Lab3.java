import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import Lab3.Clothing;

public class Lab3 {

    public static void main(String[] args) {
        // Створення масиву з об'єктами класу Lab3.Clothing
        Clothing[] clothes = {
                new Clothing("Shirt", 42, 300.50, "Red", "Cotton"),
                new Clothing("Pants", 38, 550.75, "Blue", "Denim"),
                new Clothing("Jacket", 44, 1200.30, "Black", "Leather"),
                new Clothing("T-shirt", 40, 150.00, "White", "Cotton"),
                new Clothing("Coat", 48, 2000.99, "Grey", "Wool")
        };

        // Створення об'єкта Scanner для вводу з консолі
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дані одягу через пробіли (name size price color material):");

        // Введення тексту для створення нового об'єкта
        String input = scanner.nextLine();
        String[] inputData = input.split(" "); // Розбиваємо введений рядок на частини

        // Перевірка на правильність введених даних
        if (inputData.length != 5) {
            System.out.println("Невірний формат введених даних. Має бути 5 значень.");
            return;
        }

        // Створення нового об'єкта Lab3.Clothing з введених даних
        String name = inputData[0];
        double size = Double.parseDouble(inputData[1]);
        double price = Double.parseDouble(inputData[2]);
        String color = inputData[3];
        String material = inputData[4];

        Clothing newClothing = new Clothing(name, size, price, color, material);

        // Сортування масиву за полями (size по зростанню, price по спаданню)
        Arrays.sort(clothes);

        // Виведення відсортованих об'єктів
        System.out.println("Сортування за полями (size по зростанню, price по спаданню):");
        for (Clothing c : clothes) {
            System.out.println(c);
        }

        // Перевірка на наявність введеного об'єкта в масиві
        boolean found = false;
        for (Clothing c : clothes) {
            if (c.equals(newClothing)) {
                found = true;
                break;
            }
        }

        // Виведення результату пошуку
        if (found) {
            System.out.println("Об'єкт знайдений в масиві.");
        } else {
            System.out.println("Об'єкт не знайдений в масиві.");
        }
    }
}

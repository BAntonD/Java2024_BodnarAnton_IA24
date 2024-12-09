import java.util.*;
import Lab6.CustomList;

public class Lab6 {
    public static void main(String[] args) {
        // 1. Створення порожнього списку
        CustomList<String> list1 = new CustomList<>();
        System.out.println("Testing empty list:");
        System.out.println("List 1 size: " + list1.size());
        list1.add("Item 1");
        list1.add("Item 2");
        list1.add("Item 3");
        System.out.println("List 1 size after adding 3 items: " + list1.size());
        System.out.println("List 1 contents:");
        for (String item : list1) {
            System.out.println(item);
        }
        System.out.println();

        // 2. Створення списку з одним елементом
        CustomList<String> list2 = new CustomList<>("Single Item");
        System.out.println("Testing single-element list:");
        System.out.println("List 2 size: " + list2.size());
        System.out.println("List 2 contents: " + list2.get(0));
        System.out.println();

        // 3. Створення списку з існуючої колекції
        List<String> standardList = Arrays.asList("A", "B", "C");
        CustomList<String> list3 = new CustomList<>(standardList);
        System.out.println("Testing list from a standard collection:");
        System.out.println("List 3 size: " + list3.size());
        System.out.println("List 3 contents:");
        for (String item : list3) {
            System.out.println(item);
        }
        System.out.println();

        // 4. Перевірка видалення елементу
        list3.remove("B");
        System.out.println("Testing removal of an item:");
        System.out.println("List 3 size after removal: " + list3.size());
        System.out.println("List 3 contents after removal:");
        for (String item : list3) {
            System.out.println(item);
        }
        System.out.println();

        // 5. Перевірка індексації
        System.out.println("Testing indexing:");
        System.out.println("Element at index 0: " + list3.get(0));
        System.out.println("Element at index 1: " + list3.get(1));
        System.out.println();

        // 6. Перевірка перевірки наявності елементів
        System.out.println("Testing contains:");
        System.out.println("List 3 contains 'A': " + list3.contains("A"));
        System.out.println("List 3 contains 'B': " + list3.contains("B"));
        System.out.println();

        // 7. Перевірка конвертації у масив
        System.out.println("Testing toArray:");
        Object[] array = list3.toArray();
        System.out.println("Array contents: " + Arrays.toString(array));
        System.out.println();
    }
}

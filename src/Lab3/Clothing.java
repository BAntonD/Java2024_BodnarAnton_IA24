package Lab3;

import java.util.Objects;

public class Clothing implements Comparable<Clothing> {

    // Поля класу
    private String name;
    private double size;
    private double price;
    private String color;
    private String material;

    // Конструктор для ініціалізації полів
    public Clothing(String name, double size, double price, String color, String material) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
        this.material = material;
    }

    // Гетери та сетери для кожного поля
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Lab3.Clothing [name=" + name + ", size=" + size + ", price=" + price + ", color=" + color + ", material=" + material + "]";
    }

    // Реалізація порівняння для сортування за полями size (зростанням) і price (спаданням)
    @Override
    public int compareTo(Clothing other) {
        // Спочатку порівнюємо за полем size (за зростанням)
        int result = Double.compare(this.size, other.size);
        if (result == 0) {
            // Якщо size однакове, порівнюємо за полем price (за спаданням)
            result = Double.compare(other.price, this.price); // Для спадання
        }
        return result;
    }

    // Переопреділяємо метод equals для порівняння об'єктів Lab3.Clothing
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothing clothing = (Clothing) obj;
        return name.equals(clothing.name) &&
                size == clothing.size &&
                price == clothing.price &&
                color.equals(clothing.color) &&
                material.equals(clothing.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, price, color, material);
    }
}

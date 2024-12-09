package Lab5;

public class Tariff {
    private String name;
    private double price; // абонентська плата
    private int clientCount;

    // Конструктор
    public Tariff(String name, double price, int clientCount) {
        this.name = name;
        this.price = price;
        this.clientCount = clientCount;
    }

    // Геттери та Сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getClientCount() {
        return clientCount;
    }

    public void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }

    // Переозначений метод для порівняння за ціною
    public int compareTo(Tariff other) {
        return Double.compare(this.price, other.price);
    }

    // Метод для виведення інформації про тариф
    public String toString() {
        return name + " - " + price + " USD, Clients: " + clientCount;
    }
}


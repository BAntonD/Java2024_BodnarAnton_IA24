import java.util.List;
import java.util.Scanner;
import Lab5.*;

public class Lab5 {
    public static void main(String[] args) {
        TariffCompany company = new TariffCompany();

        // Додамо деякі тарифи
        company.addTariff(new PremiumTariff("Premium Lite Plan", 17.5, 190, false));
        company.addTariff(new BasicTariff("Basic Plan", 10.0, 150));
        company.addTariff(new BasicTariff("Basic+ Plan", 15.0, 70));
        company.addTariff(new PremiumTariff("Premium Plan", 20.0, 100, true));
        company.addTariff(new UnlimitedTariff("Unlimited Plan", 30.0, 20, true));

        // Виведемо загальну кількість клієнтів
        System.out.println("Total Clients: " + company.totalClients());

        // Сортуємо тарифи за ціною
        company.sortTariffs();
        System.out.println("Sorted Tariffs:");
        company.printTariffs();

        // Пошук тарифів за ціною
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price range to search tariffs (min max):");
        double minPrice = scanner.nextDouble();
        double maxPrice = scanner.nextDouble();
        List<Tariff> foundTariffs = company.findTariffsInRange(minPrice, maxPrice);

        if (foundTariffs.isEmpty()) {
            System.out.println("No tariffs found in this price range.");
        } else {
            System.out.println("Tariffs in range " + minPrice + " to " + maxPrice + ":");
            for (Tariff tariff : foundTariffs) {
                System.out.println(tariff);
            }
        }
    }
}

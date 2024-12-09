package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TariffCompany {
    private List<Tariff> tariffs;

    public TariffCompany() {
        tariffs = new ArrayList<>();
    }

    // Додати тариф
    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    // Загальна кількість клієнтів
    public int totalClients() {
        int total = 0;
        for (Tariff tariff : tariffs) {
            total += tariff.getClientCount();
        }
        return total;
    }

    // Сортування тарифів за ціною
    public void sortTariffs() {
        Collections.sort(tariffs, (t1, t2) -> Double.compare(t1.getPrice(), t2.getPrice()));
    }

    // Пошук тарифів за діапазоном ціни
    public List<Tariff> findTariffsInRange(double minPrice, double maxPrice) {
        List<Tariff> result = new ArrayList<>();
        for (Tariff tariff : tariffs) {
            if (tariff.getPrice() >= minPrice && tariff.getPrice() <= maxPrice) {
                result.add(tariff);
            }
        }
        return result;
    }

    // Виведення всіх тарифів
    public void printTariffs() {
        for (Tariff tariff : tariffs) {
            System.out.println(tariff);
        }
    }
}


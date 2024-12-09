package Lab5;

public class UnlimitedTariff extends Tariff {
    private boolean unlimitedInternet;

    public UnlimitedTariff(String name, double price, int clientCount, boolean unlimitedInternet) {
        super(name, price, clientCount);
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean hasUnlimitedInternet() {
        return unlimitedInternet;
    }

    @Override
    public String toString() {
        return super.toString() + ", Unlimited Internet: " + (unlimitedInternet ? "Yes" : "No");
    }
}


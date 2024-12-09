package Lab5;

public class PremiumTariff extends Tariff {
    private boolean includesInternationalCalls;

    public PremiumTariff(String name, double price, int clientCount, boolean includesInternationalCalls) {
        super(name, price, clientCount);
        this.includesInternationalCalls = includesInternationalCalls;
    }

    public boolean includesInternationalCalls() {
        return includesInternationalCalls;
    }

    @Override
    public String toString() {
        return super.toString() + ", International Calls: " + (includesInternationalCalls ? "Yes" : "No");
    }
}


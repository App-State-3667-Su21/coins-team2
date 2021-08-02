public class Pound extends Coin {
    public Pound() {
        super(1.0);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 70% Cu and" +
            " 24.5% Zi and 5.5% Ni...completed");
    }
}
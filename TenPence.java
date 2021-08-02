public class TenPence extends Coin {
    public TenPence() {
        super(0.1);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + 
            " with 75% Cu and 25% Ni...completed");
    }
}
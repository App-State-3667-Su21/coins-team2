public class FiftyPence extends Coin {
    public FiftyPence() {
        super(0.5);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 75% Cu and 25% Ni...completed");
    }
}
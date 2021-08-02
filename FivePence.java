public class FivePence extends Coin {
    public FivePence() {
        super(0.05);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + 
            " with 75% Cu and 25% Ni...completed");
    }
}
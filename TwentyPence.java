public class TwentyPence extends Coin {
    public TwentyPence() {
        super(0.2);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + 
            " with 84% Cu and 16% Ni...completed");
    }
}
public class TwoPence extends Coin {
    public TwoPence() {
        super(0.02);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + 
            " with Cu plated steel...completed");
    }
}
public class Pence extends Coin {
    public Pence() {
        super(0.01);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + 
            " with Cu plated steel...completed");
    }
}
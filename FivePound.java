
public class FivePound extends Coin {
    public FivePound() {
        super(5.0);
        countryCode = "GBP";
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 75% Cu and 25% Ni...completed");
    }
}
public class Nickel extends Coin {
    
    public Nickel() {
        super(0.05);
        countryCode = "USD";
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 2.5% Cu and 97.5% Zn...completed.");
    }
}
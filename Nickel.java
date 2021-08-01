public class Nickel extends Coin {
    
    public Nickel() {
        super(0.05);
        countryCode = "USD";
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 75% Cu and 25% Ni...completed.");
    }
}
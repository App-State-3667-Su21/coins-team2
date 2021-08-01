public class Penny extends Coin {
    
    public Penny() {
        super(0.01);
        countryCode = "USD";
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 2.5% Cu and 97.5% Zn...completed.");
    }
}
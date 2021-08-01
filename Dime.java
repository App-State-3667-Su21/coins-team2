public class Dime extends Coin {

    public Dime() {
        super(0.1);
        countryCode = "USD";
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 91.67% Cu and 8.33% Ni...completed.");
    }
}
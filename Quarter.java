public class Quarter extends Coin {

    public Quarter() {
        super(0.25);
        countryCode = "USD";
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 91.67% Cu and 8.33% Ni...completed.");
    }
}
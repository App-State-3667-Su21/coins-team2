public class Dollar extends Coin {

    public Dollar() {
        super(1.0);
        countryCode = "USD";
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 88.5% Cu, 6% Zn, 3.5% Mn, and 2% Ni...completed.");
    }
}
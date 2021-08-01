public class HalfDollar extends Coin {

    public HalfDollar() {
        super(0.5);
        countryCode = "USD";
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() + " with 91.67% Cu and 8.33% Ni...completed.");
    }
}
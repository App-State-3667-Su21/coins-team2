public class HalfDollar extends Coin {

    public HalfDollar() {
        super(0.5);
        countryCode = "USD";
    }

    public void smelt() {
        System.out.println("Smelting coin...");
    }

    public void inspect() {
        System.out.println("Inspecting coin...");
    }

    public void smooth() {
        System.out.println("Smoothing coin...");
    }

    public void buff() {
        System.out.println("Buffing coin...");
    }
}
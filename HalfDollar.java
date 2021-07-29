public class HalfDollar extends Coin {

    public HalfDollar() {
        countryCode = "USD";
        denomination = 0.50;
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
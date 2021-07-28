public class Dollar extends Coin {

    public Dollar() {
        countryCode = "USD";
        denomination = 1.00;
    }

    public void smelt() {
        System.out.println("Smelting coin...");
    }

    public void imprint() {
        System.out.println("Imprinting coin...");
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
public class Quarter extends Coin {

    public Quarter() {
        countryCode = "USD";
        denomination = 0.25;
    }

    public void smelt() {
        System.out.println("Smelting " + this.getClass() +  "...completed.");
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
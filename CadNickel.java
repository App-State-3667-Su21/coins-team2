public class CadNickel extends Coin {
    public CadNickel() {
        countryCode = "CAD";
        denomination = 0.05;
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
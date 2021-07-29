public abstract class Coin {
    public String countryCode;
    public double denomination;

    public Coin(double denomination) {
        this.denomination = denomination;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getDenomination() {
        return denomination;
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() +  "...completed.");
    }

    public void inspect() {
        System.out.println("Inspecting " + this.getClass().getSimpleName() +  "...completed.");
    }

    public void smooth() {
        System.out.println("Smoothing " + this.getClass().getSimpleName() +  "...completed.");
    }

    public void buff() {
        System.out.println("Buffing " + this.getClass().getSimpleName() +  "...completed.");
    }
}
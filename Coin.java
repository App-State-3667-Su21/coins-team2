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

    /**
     * TODO: Need to add abstract methods for the minting process, including:
     *  smelting, imprinting, inspecting, smoothing, buffing
     *  inspecting fails 1 in 12 times, smoothing and buffing fail 1 in 1000
     */

    
    public abstract void smelt();

    public abstract void imprint();

    public abstract void inspect();

    public abstract void smooth();

    public abstract void buffing();
}

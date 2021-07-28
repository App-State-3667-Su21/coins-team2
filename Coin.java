public abstract Coin {
    public String countryCode;
    public double denomination;

    public Coin(double denomination) {
        this.denomination = denomination;
    }

    public getCountryCode() {
        return countryCode;
    }

    public getDenomination() {
        return denomination;
    }

    /**
     * TODO: Need to add abstract methods for the minting process, including:
     *  smelting, imprinting, inspecting, smoothing, buffing
     *  inspecting fails 1 in 12 times, smoothing and buffing fail 1 in 1000
     */

    public abstract smelt();

    public abstract imprint();

    public abstract inspect();

    public abstract smoothing();

    public abstract buffing();
}
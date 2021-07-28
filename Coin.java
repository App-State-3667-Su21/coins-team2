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

}
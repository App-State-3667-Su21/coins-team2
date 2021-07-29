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
    
    public abstract void smelt();

    public abstract void inspect();

    public abstract void smooth();

    public abstract void buffing();
}
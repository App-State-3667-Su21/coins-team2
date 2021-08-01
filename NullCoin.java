public class NullCoin extends Coin {

    public NullCoin() {
        super(-1);
    }
    
    public String getCountryCode() {
        return "";
    }

    public double getDenomination() {
        return -1;
    }
    
    public void manufactureCoin() {};

    public void smelt() {};

    public void inspect() {};

    public void smooth() {};

    public void buff() {};
}
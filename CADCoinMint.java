public class CADCoinMint extends CoinMint {

    // TODO: Eventually turn this into singleton.
    public CADCoinMint() {}

    /**
     * Creates a coin with the respective country code and denomination.
     * 
     * @param denom a double representation of the denomination of the coin
     * @return a Coin reference to the respective coin based on denomination
     */
    public Coin createCoin(double denom) {

        switch(denom) {
            case 2.00:
                return new Toonie();
                break;
    
            case 1.00:
                return new Loonie();
                break;
            
            case 0.50:
                return new FiftyCent();
                break;

            case 0.25:
                return new CadQuarter();
                break;

            case 0.10:
                return new CadDime();
                break;

            case 0.05:
                return new CadNickel();
                break;

            default:
            // TODO: This is where we would implement NullCoin?
        }
    }
}
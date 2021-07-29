public class USDCoinMint extends CoinMint {

    // TODO: Eventually turn this into singleton.
    public USDCoinMint() {}

    /**
     * Creates a coin with the respective country code and denomination.
     * 
     * @param denom a double representation of the denomination of the coin
     * @return a Coin reference to the respective coin based on denomination
     */
    public Coin createCoin(double denom) {

        switch(denom) {
            case 1.00:
                return new Dollar();
                break;
            
            case 0.50:
                return new HalfDollar();
                break;

            case 0.25:
                return new Quarter();
                break;

            case 0.10:
                return new Dime();
                break;

            case 0.05:
                return new Nickel();
                break;

            case 0.01:
                return new Penny();
                break;

            default:
                return null;
                break;
            // TODO: This is where we would implement NullCoin?
        }
    }
}
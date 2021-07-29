public class USDCoinMint extends CoinMint {
    private volatile static USDCoinMint uniqueInstance;

    // TODO: Eventually turn this into singleton.
    private USDCoinMint() {}

    public static USDCoinMint getInstance() {
        if (uniqueInstance == null) {
            synchronized (USDCoinMint.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new USDCoinMint();
                }
            }
        }
        return uniqueInstance;
    }

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
            // TODO: This is where we would implement NullCoin?
        }
    }
}
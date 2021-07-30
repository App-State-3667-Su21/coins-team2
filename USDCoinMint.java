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
        String denomS = String.valueOf(denom);
        switch(denomS) {
            case "1.0":
                return new Dollar();
            
            case "0.5":
                return new HalfDollar();

            case "0.25":
                return new Quarter();

            case "0.1":
                return new Dime();

            case "0.05":
                return new Nickel();

            case "0.01":
                return new Penny();

            default:
                return new NullCoin();
                // TODO: This is where we would implement NullCoin?
        }
    }
}

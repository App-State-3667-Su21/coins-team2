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

        String denomString = String.valueOf(denom);

        switch(denomString) {
            case "1.00":
            case "1.0":
            case "1":
                return new Dollar();
                //break;
            
            case "0.50":
            case ".50":
            case "0.5":
            case ".5":
                return new HalfDollar();
                //break;

            case "0.25":
            case ".25":
                return new Quarter();
                //break;

            case "0.10":
            case ".10":
            case "0.1":
            case ".1":
                return new Dime();
                //break;

            case "0.05":
            case ".05":
                return new Nickel();
                //break;

            case "0.01":
            case ".01":
                return new Penny();
                //break;

            default:
System.out.println("Something wrong");
            // TODO: This is where we would implement NullCoin?
            return null;
        }
    }
}

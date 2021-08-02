public class GBPCoinMint extends CoinMint {
    private volatile static GBPCoinMint uniqueInstance;

    private GBPCoinMint() {

    }

    public static CADCoinMint getInstance() {
       if (uniqueInstance == null) {
           synchronized (GBPCoinMint.class) {
               if (uniqueInstance == null) {
                   uniqueInstance = new GBPCoinMint();
               }
           }
       } 
       return uniqueInstance;
    }

    public Coin createCoin(double denom) {
        String denomS = String.valueOf(denom);
        switch(denomS) {
            case "5.0":
                return new FivePound();
            
            case "2.0": 
                return new TwoPound();

            case "1.0": 
                return new Pound();

            case "0.5":
                return new FiftyPence();

            case "0.2":
                return new TwentyPence();

            case "0.1":
                return new TenPence();

            case "0.05": 
                return new FivePence();

            case "0.02": 
                return new TwoPence();

            case "0.01":
                return new Pence();

            default:
                return Coin.NULL;
        }
    }
} 
/**
 * CoinMint factory abstraction, will be extended to create CoinMint factories.
 * 
 * @author Coins Team 2
 * @version Summer 2021
 */
public abstract class CoinMint {
    
    /**
     * Performs the minting process on a created coin.
     * 
     * @param d is a double representation of the denomination of the coin
     * @return a reference to a coin object that has been minted
     */
    public Coin mintCoin(double d) {
        Coin coin;

        // defer to coin mint to create a coin with respective denomination
        coin = createCoin(d);

        // manufacturing process of minting
        coin.manufactureCoin();
        return coin;
    }

    /**
     * Abstract method that will create a coin with respective denomination.
     * Will need to be implemented by concrete CoinMints.
     * 
     * @param d is a double representation of the denomination of the coin
     * @return a Coin reference that has been created by a coin mint
     */
    public abstract Coin createCoin(double d);

}

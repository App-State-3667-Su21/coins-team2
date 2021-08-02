import java.util.Random;

/**
 * Coin abstraction.
 * 
 * @author Coins Team 2
 * @version Summer 2021
 */
public abstract class Coin {
    public static final Coin NULL = new NullCoin();
    public String countryCode;
    public double denomination;
    Random r = new Random();

    /**
     * Constructor.
     * 
     * @param denomination is the monetary value represented the coin
     */
    public Coin(double denomination) {
        this.denomination = denomination;
    }
    
    /**
     * Will return the country code of the coin.
     * 
     * @return the country code for the coin 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Will return the monetary value of the coin.
     * 
     * @return the monetary value the coin represents
     */
    public double getDenomination() {
        return denomination;
    }
    
    /**
     * Simulate the completion of the manufacturing of a coin.
     */
    public void manufactureCoin() {
        smelt();
        imprint();
        if (this.r.nextInt(12) == 0) {
            System.out.println("Inspecting " + this.getClass().getSimpleName()
                                + "...failed.");
            System.out.println("Failed to manufacture coin.");
        }
        else {
            inspect();
            if (this.r.nextInt(1000) == 0) {
                System.out.println("Buffing " + this.getClass().getSimpleName()
                                    + "...failed.");
                System.out.println("Failed to manufacture coin.");
            }
            else {
                buff();
                if (this.r.nextInt(1000) == 0) {
                    System.out.println("Smoothing " + 
                            this.getClass().getSimpleName() +  "...failed.");
                    System.out.println("Failed to manufacture coin.");
                }
                else {
                    smooth();
                    System.out.println("(" + this.getClass().getSimpleName() +
                     ")$" + this.getDenomination());
                }
            }
        }
    }
    
    /**
     * Simulates smelting a coin.
     * Will need concrete Coins to implement this because they have unique compositions.
     */
    public abstract void smelt();
    
    /**
     * Will print a message simulating a coin being imprinted.
     */
    public void imprint() {
        System.out.println("Imprinting " + this.getClass().getSimpleName() + "...completed.");
    }

    /**
     * Will print a message simulating a coin being inspected.
     */
    public void inspect() {
        System.out.println("Inspecting " + this.getClass().getSimpleName() +  "...completed.");
    }

    /**
     * Will print a message simulating a coin being smoothed.
     */
    public void smooth() {
        System.out.println("Smoothing " + this.getClass().getSimpleName() +  "...completed.");
    }

    /**
     * Will print a message simulating a coin being buffed.
     */
    public void buff() {
        System.out.println("Buffing " + this.getClass().getSimpleName() +  "...completed.");
    }
    
    /**
     * 
     */
    private static class NullCoin extends Coin {
        /**
         * 
         */
        public NullCoin() {
            super(-1);
        }

        /**
         * 
         */
        @Override
        public String getCountryCode() {
            return "";
        }

        /**
         * 
         */
        @Override
        public double getDenomination() {
            return -1;
        }

        /**
         * 
         */
        @Override
        public void smelt() {}
        
        
        /**
         * 
         */
        @Override
        public void inspect() {}
        
        /**
         * 
         */
        @Override
        public void smooth() {}
  
        /**
         * 
         */
        @Override
        public void buff() {}

        /**
         * 
         */
        @Override
        public void manufactureCoin() {}
    }
}

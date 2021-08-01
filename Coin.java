import java.util.Random;

public abstract class Coin {
    public String countryCode;
    public double denomination;
    Random r = new Random();

    public Coin(double denomination) {
        this.denomination = denomination;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getDenomination() {
        return denomination;
    }
    
    public void manufactureCoin() {
        smelt();
        imprint();
        if (this.r.nextInt(12) == 0) {
            System.out.println("Inspecting " + this.getClass().getSimpleName() +  "...failed.");
            System.out.println("Failed to manufacture coin.");
        }
        else {
            inspect();
            if (this.r.nextInt(1000) == 0) {
                System.out.println("Buffing " + this.getClass().getSimpleName() +  "...failed.");
                System.out.println("Failed to manufacture coin.");
            }
            else {
                buff();
                if (this.r.nextInt(1000) == 0) {
                    System.out.println("Smoothing " + this.getClass().getSimpleName() +  "...failed.");
                    System.out.println("Failed to manufacture coin.");
                }
                else {
                    smooth();
                    System.out.println("(" + this.getClass().getSimpleName() + ")$" + this.getDenomination());
                }
            }
        }
    }
    
    public abstract void smelt();
    
    public void imprint() {
        System.out.println("Imprinting " + this.getClass().getSimpleName() + "...completed.");
    }

    public void inspect() {
        System.out.println("Inspecting " + this.getClass().getSimpleName() +  "...completed.");
    }

    public void smooth() {
        System.out.println("Smoothing " + this.getClass().getSimpleName() +  "...completed.");
    }

    public void buff() {
        System.out.println("Buffing " + this.getClass().getSimpleName() +  "...completed.");
    }

    private static class NullCoin extends Coin {
        public NullCoin() {
            super(-1);
        }
        @Override
        public String getCountryCode() {
            return "";
        }
        @Override
        public double getDenomination() {
            return -1;
        }
        @Override
        public void smelt() {}
        @Override
        public void inspect() {}
        @Override
        public void smooth() {}
        @Override
        public void buff() {}
    }
    public static Coin NULL = new NullCoin();
}
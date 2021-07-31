public abstract class Coin {
    public String countryCode;
    public double denomination;

    public Coin(double denomination) {
        this.denomination = denomination;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getDenomination() {
        return denomination;
    }
    
    public void smelt() {
        System.out.println("Smelting " + this.getClass().getSimpleName() +  "...completed.");
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
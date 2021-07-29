import java.util.Scanner;

public class Demo {
    final static double ZERO = 0.0;
    Scanner kb = new Scanner(System.in);

    public static void main(String [] args) {
        Demo d = new Demo();
        //Scanner kb = new Scanner(System.in);
        USDCoinMint usdMint = new USDCoinMint();

        double denom;
        do {
            denom = d.getDenom();
            Coin c = usdMint.createCoin(denom);

            if (c == null) {
                if (denom != ZERO) {
                    System.out.println("Error reading your entry");
                }
                else {
                    System.out.println();
                }
            }
            else {
                usdMint.mintCoin(denom);
                System.out.println();
            }

        }while(denom != ZERO);
    }

    public double getDenom() {
        System.out.print("Enter coin denomination (0.25 = a quarter, 0 to quit): ");
        String d = kb.nextLine();
        double denom = Double.parseDouble(d);

        return denom;
    }
}
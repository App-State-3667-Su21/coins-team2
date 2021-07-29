import java.util.Scanner;

public class Demo {
    final static double ZERO = 0.0;
    Scanner kb = new Scanner(System.in);

    public static void main(String [] args) {
        Demo d = new Demo();
        //Scanner kb = new Scanner(System.in);
        USDCoinMint usdMint = USDCoinMint.getInstance();

        double denom;
        do {
            denom = d.getDenom();
            Coin c = usdMint.createCoin(denom);

            if (c == null) {
                if (denom != ZERO) {
                    System.out.println("Error reading your entry\n");
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
        
        // will prevent demo from crashing if a number is not entered
        double denom;
        try{
            denom = Double.parseDouble(d);
        }
        catch (NumberFormatException e) {
            denom = -1.0;
        }

        return denom;
    }
}
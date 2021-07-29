import java.util.Scanner;

public class Demo {
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
                System.out.println("Error reading your entry");
            }
            else {
                usdMint.mintCoin(denom);
            }

        }while(denom != 0.0);
    }

    public double getDenom() {
        System.out.print("Enter coin denomination (0.25 = a quarter, 0 to quit): ");
        String d = kb.nextLine();
        denom = d.parseDouble();
        
        return denom;
    }
}
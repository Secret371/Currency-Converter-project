import java.util.Scanner;

public class CurrencyConverter {
    private static double usdToEur;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double usdToGbp = 0.79;
        double usdToJpy = 157.0;
        double usdToAud = 1.52;
        double usdToCad = 1.36;
        double usdToCny = 7.25;
        double usdToInr = 83.0;
        usdToEur = 0.92;

        System.out.println("Currency Converter");
        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        double inr = amount * usdToInr;
        double eur = amount * usdToEur;
        double gbp = amount * usdToGbp;
        double jpy = amount * usdToJpy;
        double aud = amount * usdToAud;
        double cad = amount * usdToCad;
        double cny = amount * usdToCny;

        System.out.printf("%.2f USD = %.2f INR\n", amount, inr);
        System.out.printf("%.2f USD = %.2f EUR\n", amount, eur);
        System.out.printf("%.2f USD = %.2f GBP\n", amount, gbp);
        System.out.printf("%.2f USD = %.2f JPY\n", amount, jpy);
        System.out.printf("%.2f USD = %.2f AUD\n", amount, aud);
        System.out.printf("%.2f USD = %.2f CAD\n", amount, cad);
       
        scanner.close();
    }
}


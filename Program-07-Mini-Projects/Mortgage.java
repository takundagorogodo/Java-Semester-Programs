import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        final int MONTHS = 12;
        final int PERCENT = 100;

        int principal = 0;
        float annualInterest = 0;
        int numberOfPayments = 0;
        float monthlyInterest;

        Scanner scanner = new Scanner(System.in);

        // PRINCIPAL
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();

            if (principal >= 1000 && principal <= 1_000_000)
                break;

            System.out.println("Enter a value between 1000 and 1000000.");
        }

        // INTEREST RATE
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();

            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS;
                break;
            }

            System.out.println("Enter a value between 1 and 30.");
        }

        // YEARS → NUMBER OF PAYMENTS
        //float monthlyInterest = annualInterest / PERCENT / MONTHS;

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();

            if (years >= 1 && years <= 30) {
                numberOfPayments = years * 12;
                break; // ← FIXED (you forgot this)
            }

            System.out.println("Enter a value between 1 and 30.");
        }

        // MORTGAGE FORMULA
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the rate of interest(in %): ");
        rate = scanner.nextDouble();
        rate = rate / 100; // Convert percentage to decimal

        System.out.print("Enter the number of times compunded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Calculate the amount using the compound interest formula
        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
       
        System.out.printf("The amoun after %d years is: $%.2f\n", years, amount);

        scanner.close();
    }
}
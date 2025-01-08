import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String product;
        int price;
        int quantity;
        int total;
        char currancy = '₹';

        System.out.print("What you want to buy: ");
        product = scanner.nextLine();

        System.out.print("Set the price for it: ");
        price = scanner.nextInt();

        System.out.print("Set the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("You have bought: " + quantity + " item" + " of " + product );

        System.out.println("Total: " + total + currancy);

        scanner.close();
    }
}

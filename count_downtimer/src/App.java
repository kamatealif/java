import java.util.Scanner;
import java.util.InputMismatchException;
import java.awt.Toolkit;

public class App {

    private static int getSeconds(Scanner scanner) {
        int seconds = 1;
        while (true) {
            try {
                System.out.print("Enter the number of seconds: ");
                seconds = scanner.nextInt();
                if (seconds < 1) {
                    System.out.println("Invalid input, Please enter a positive number");
                    continue;
                } else {
                    return seconds;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter a positive number");
                scanner.next(); // clear invalid input
            }
        }
    }

    private static void RemainingTime(int seconds) {
        for (int i = seconds; i >= 0; i--) {
            int minutes = i / 60;
            int secs = i % 60;
            System.out.printf("%02d:%02d\r", minutes, secs);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Time's up!");

        // play a beep sound
        if (System.getProperty("os.name").startsWith("Windows")) {
            java.awt.Toolkit.getDefaultToolkit().beep();
        } else {
            System.out.println("\007");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int seconds = getSeconds(scanner);

        RemainingTime(seconds);
        scanner.close();
    }
}

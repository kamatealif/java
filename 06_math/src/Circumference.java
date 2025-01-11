import java.util.Scanner;
public class Circumference {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * pi * radius;
        
        System.out.println("The circumference is: " + circumference);

        scanner.close();
    }
}

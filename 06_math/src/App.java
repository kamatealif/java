import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("value of pi: " + Math.PI);
        // System.out.println("Value of e: " + Math.E);
        Scanner scanner = new Scanner(System.in);

        double result;
        result = Math.pow(2,4);
        result = Math.sqrt(16);
        result = Math.abs(-10);
        result = Math.round(10.8);
        result = Math.ceil(10.7);
        result = Math.floor(10.7);
        result = Math.min(5,1);
        result = Math.max(10,50);
        
        System.out.println("result: " + result);

        // Exercise 
        //hypotenous of a triangle = sqrt(a^2 + b^2);

        System.out.print("Enter side a: ");
        double a  = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        // double hypotenous = Math.sqrt((a*a) + (b*b));
        // double hypotenous = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double hypotenous = Math.hypot(a,b);

        //those all calculations are valid
        System.out.println("Hypotenous side(c)" + hypotenous + "cm");

        scanner.close();

    }
}

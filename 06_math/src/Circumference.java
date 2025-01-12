import java.util.Objects;
import java.util.Scanner;
public class Circumference {
    //formulas
    // circumference = 2 * pi * radius
    // area = pi * radius**2
    // valume = (4.0/3.0) * pi * radius^2;
    public static void menu(){
        System.out.println("1. circumeference of traingle");
        System.out.println("2. area of circle");
        System.out.println("3. Valume");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;

        menu();
        System.out.println("Enter the choice");
       String choice = scanner.next();

       if (Objects.equals(choice, "1")){
           System.out.print("Enter radius: ");
           double radius = scanner.nextDouble();

           double circumference = 2 * pi * radius;

           System.out.println("The circumference is: " + circumference);

       } else if (Objects.equals(choice, "2")) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            double result;
            result = pi * Math.pow(radius,2);

            System.out.println("Area : " + result);
       }else{
            // valume = (4.0/3.0) * pi * radius^2;

            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            double result;

            result = (4.0/3.0) * pi * Math.pow(radius,2);
            System.out.println("Valume: " + result);
        }
        scanner.close();
    }
}

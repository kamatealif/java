import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // if statement = performs a block of code if the condition is true;

        
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;        
        boolean isStudent;


        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter your Age: ");
        age = scanner.nextInt();

        System.out.print("Your a student or not (true/false)");
        isStudent = scanner.nextBoolean();


        // GROUP 1  
        if(name.isEmpty()){
            System.out.println("You have'nt Entered your name! ");
        }
        else{
            System.out.println("Hello " + name);
        }


        //GROUP 2;        
        if(age >= 65){
            System.out.println("You're a Senior!");
        }
        else if(age >= 18){
            System.out.println("You're a Adult!");
        }
        else if(age < 0 ) {
            System.out.println("You're haven't been born yet!");
        }
        else{
            System.out.println("You'r a child!");
        }

        // GROUP 3
    
        if(isStudent){
            System.out.println("Your a Student");
        }
        else{
            System.out.println("You're not a Student");
        }
        scanner.close();
    }
}

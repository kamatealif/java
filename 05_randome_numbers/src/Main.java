import java.util.Random;
public class Main{
    public static void main(String[] args){
        Random random = new Random();

        int number1 ;
        int number2;
        int number3;

        number1 = random.nextInt(1,101); // origin is inclusive and bond is exclusive
        number2 = random.nextInt(1,101);
        number3 = random.nextInt(1,101);


        System.out.println("Random number1: "+ number1);
        System.out.println("Random number2: "+ number2);
        System.out.println("Random number3: "+ number3);



        //doubles
        System.out.println("\nDoubles...");
        double decimal_number = random.nextDouble();
        System.out.println("Random double : " + decimal_number);

        //booleans
        System.out.println("\nBooleans...");
        boolean isHead = random.nextBoolean();
        if(isHead){
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }

    }
}
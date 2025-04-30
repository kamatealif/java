public class App{
    public static void main(String[] args){
        test();

        // EXECUTE CODE FOR THE SPECIFIED NUMBER OF TIMES
        specifiedNumber();

        // CALCULATING THE SUM OF 1 TO 1 WITH WHILE LOOP
        sumOfNumbers();
    }

    public static void test(){
        int c = 1;
        while (c <=10){
            System.out.println(c);
            c++;
        }
    }

    // EXECUTE CODE FOR THE SPECIFIED NUMBER OF TIMES
    public static void specifiedNumber(){
        int c = 1;

        // test expression
        while (c < 6) {
            System.out.printf("Hello world" + "[%d]", c );
            c++;
        }
    }

    // CALCULATING THE SUM OF 1 TO 1 WITH WHILE LOOP
    public static void sumOfNumbers(){
        int i = 1, sumOfNumbers = 0;
        while( i <=10){
            sumOfNumbers = sumOfNumbers + 1;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sumOfNumbers);
    }
    
}
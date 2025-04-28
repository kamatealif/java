public class App{
    public static void main(String[] args){
        for( int i = 0; i <= 10; i++){
            System.out.print(" " + i);
        }
        System.out.println("\nLoop finished!");

        // print hello world 5 times
        printHelloWorld(5);

        // calculate the sum of 10 numbers
        int total = sumOfNumbers(10);
        System.err.println("Sum of 10 numbers is: " + total);
    }

    // function for print hello world 5 times
    public static void printHelloWorld(int times){
        for(int i = 0; i < times; i ++){
            System.out.printf("[%d] Hello World!\n",i);
        }
    }

    // function for calculating the sum of n numbers
     public static int sumOfNumbers(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
     }
}
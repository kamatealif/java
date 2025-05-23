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

        // nested loops
        System.out.println("Nested loops:");
        nestedLoops(3);

        // infinite loops
        System.out.println("Infinite loops:");
        // infiniteLoop1();
        // infiniteLoop2();

        // print the table of number
        System.out.println("Table of 5:");
        printTable(5);
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

     // nested loops 
     public static void nestedLoops(int n){
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=n ; j++){
                System.out.printf("(%d, %d)", i, j);
            }
            System.out.println();
        }
     }

     // infinite loops
     public static void infiniteLoop1(){
        for(int i =0 ; i > 10; i++){
            System.out.println("Infinite loop 1: " + i);
        }
     }

     public static void infiniteLoop2(){
     for (;;){
        System.out.println("Infinite loop 2: ");
     }
    }
     // print the table of number
     public static void printTable(int n) {
        for (int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
     
}
}
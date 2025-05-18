class Add {
    int sum = 0;

    public int addTwoNumbers(int a, int b){
        sum = a + b;
        return sum;
    }
}

public class App {

    // method to print message
    public  void printMessage(){
        System.out.println("Hello worl!");
    }
    public static void main(String[] args) throws Exception {

        Add a = new Add();
        a.addTwoNumbers(10, 20);
        System.out.println("Sum of two numbers is: " + a.sum);
        // print message function call 
        App obj = new App();
        obj.printMessage();
    }
}

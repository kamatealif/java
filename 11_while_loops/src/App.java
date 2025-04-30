public class App{
    public static void main(String[] args){
        test();

        // EXECUTE CODE FOR THE SPECIFIED NUMBER OF TIMES
        specifiedNumber();
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
}
public class App{
    public static void main(String[] args){
        doTest();

        System.out.println("one time itration");
        MiniMumOneIteration();
        System.out.println("tration end");


        // BREAK STATEMENTS
        doBreak();

        FOR LOOPS
        doBreakFor();

    }

    public static void doTest(){
        int c = 10;
        do{
            System.out.println(c);
            c--;
            
        
        }while(c > 0);
    }

    public static void MiniMumOneIteration(){
        int c = 1;
        do{
            System.out.println(c);
        
        }while(c < 0);
    }

    // break statements
    public static void doBreak(){
        int c = 10;
        do{
            System.out.println(c);
            c--;
            if(c == 5){
                break;
            };
        }while(c > 0);
        System.out.println(c);
        System.out.println("itration end");
    }

    //  WE CAN ALSO DO THIS WITH THE FOR LOOPS
    public static void doBreakFor(){
        for (int i =1; i <=10; i++){
            System.out.println(i);
            if(i ==5){
                break;
            }
        }
    }
    
}
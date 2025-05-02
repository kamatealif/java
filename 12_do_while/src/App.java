public class App{
    public static void main(String[] args){
        doTest();

        System.out.println("one time itration");
        MiniMumOneIteration();
        System.out.println("tration end");


        // BREAK STATEMENTS
        doBreak();

        // FOR LOOPS
        doBreakFor();

        System.out.println("continue statement");
        continueStatement();

        System.out.println("continue statement while loop");
        continueStatementWhile();

        // continue statements inside do while loop
        System.out.println("continue statement do while loop");
        continueStatementDoWhile();
        

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

     // continue statements
     public static void continueStatement(){
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }

    // continue statements inside while loop
    public static void continueStatementWhile(){
        int c = 0;
        // while loop 
        while ( c <=5){
            // continue sue when c ==3
            if (c ==3){
                c++;
                continue;
            }
            System.out.println(c + " ");
            c++;
        }
    }

    // continue statements inside do while loop
    public static void continueStatementDoWhile(){
        int i = 0;
        do{
            // continue statement used when i == 3
            if( i ==3){
                i++;
                continue;
            }
            System.out.println(i + " ");
            i++;

        }while(i <=5);
    }

    
    
}
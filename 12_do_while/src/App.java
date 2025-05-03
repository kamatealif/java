public class App{
    void calc(int a, int b){
        int res = (a + b)/ 10;
        System.out.println(res);
    }
    public static void main(String[] args){
        new App().calc(5,7);
        System.out.println("No return keyword is used, and proram executed successfully");
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

        // continue statement inside the inner loop(nested Loop)
        System.out.println("continue statement nested loop");
        continueStatementNestedLoop();
        
        // return keyword
        System.out.println("return keyword");
        System.out.println(avg(10, 20));


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

    // continue statement inside the inner loop(nested Loop)
    public static void continueStatementNestedLoop(){
    // outer loop
        for(int i = 1; i <=4; i++){
            // inner loop
            for(int j = 1; j <=3; j++){
                // continue statement in inner loop to skip the execution when i ==3;
                if (i == 3){
                    continue;
                }
                System.out.printf("(%d, %d)\n", i, j);
            }
            System.out.println();
      }
    }

    // return keyword
    public static double avg(double x , double y){
        double res = (x + y)/2;
        return res;
    }
    
}
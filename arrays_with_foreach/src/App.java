public class App {
    public static void main(String[] args) throws Exception {
        int num1[] = {1,2,3,4,5};
        // printing the values 

        System.out.println(num1[0]);

        // updating values 
        num1[1] = 100;
        System.out.println(num1[1]);

        // getting aal the values 
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}

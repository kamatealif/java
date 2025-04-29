import java.io.*;

public class App{
    public static void main(String[] args){
       // for each loop 
        System.out.println("for each loop");
        eacher();

        // find max number in an array
        System.out.println("find max number in an array");
        int[] arr ={112,1,2234,43892,9090,1283,189289};
        int maxNumber = findMax(arr);
        System.out.println("Max number is: " + maxNumber);
    }

    public static void eacher(){
        String[] names = {"John", "Jane", "Jack"};
        for (String name : names) {
            System.out.println(name);
        }
    }
    // find the maximum number in an array
    public static int findMax(int[] arr){
        int maximum = arr[0];

        for (int n : arr){
            if( n > maximum){
                maximum = n;
            }
        }
        return maximum;

    }

}
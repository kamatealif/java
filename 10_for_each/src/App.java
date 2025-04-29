import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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


        // find max number in a list using for each loop
        System.out.println("find max number in a list using for each loop");
        findMaxLElement();
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

    // find the maximum element in a list using a for-each loop
    public static  void findMaxLElement(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // minimum integer value as max
        int max = Integer.MIN_VALUE;
        for( Integer i: numbers){
            if(i > max){
                max = i;
            }
        }

        System.out.println("List of Integers:" + numbers);
        System.out.println("Maximum element in the List : " + max);
    }

}
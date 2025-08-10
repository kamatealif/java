
class App {

    public static void main(String argsp[]) {

        int zero_nums[] = new int[4]; // here all 10 elements are by default set to 0
        int nums[] = { 1, 2, 3, 4 };
        nums[1] = 12;

        String names[] = new String[5];

        // System.out.println("first value: " + nums[0]);
        // System.out.println("Updated value: " + nums[1]);
        for (int i : zero_nums) {
            // System.out.print(i + " ");
        }

        // now lets update the our empty array
        zero_nums[0] = 10;
        zero_nums[1] = 20;
        zero_nums[2] = 30;
        zero_nums[3] = 40;

        // loops for printing the numbers
        for (int i = 0; i < zero_nums.length; i++) {
            // System.out.println("Value at index " + i + ": " + zero_nums[i]);
        }

        // now lets update the our empty array of names
        names[0] = "Alice";
        names[1] = "Oggy";
        names[2] = "Bob";
        names[3] = "Jack";
        names[4] = "olivia";

        // loop for printing the names
        for (int i = 0; i < names.length; i++) {
            // System.out.println("Value at index " + i + ": " + names[i]);
        }

        // multidimentional array
        // int multi_nums[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int multi_num[][] = new int[3][4]; // 3 rows and 4 columns

        // loop for updating the multidimensional array with random values
        for (int i = 0; i < multi_num.length; i++) {
            for (int j = 0; j < multi_num[i].length; j++) {
                multi_num[i][j] = (int) Math.round(Math.random() * 10);
            }
        }

        // loop for printing the multidimensional array
        for (int i = 0; i < multi_num.length; i++) {
            for (int j = 0; j < multi_num[i].length; j++) {
                System.out.print(multi_num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // another method to print the multidimensional array
        for (int[] arr : multi_num) {
            for (int item : arr) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

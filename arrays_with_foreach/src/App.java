public class App {
    public static void NormalArray() {
        int nums[][] = new int[3][4];

        // lets generate the random numbers for the 2d array
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                if (nums[i][j] == 0) {
                    nums[i][j] = (int) (Math.random() * 9) + 1;
                }
            }
        }

        System.out.println("Using for each loop ... ");
        // using for eacch
        for (int[] row : nums) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    public static void JaggedArray() {
        int nums[][] = new int[3][];

        // here we can also specifiy the how many rows we want in each column
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[4];
        // lets generate the random numbers for the 2d array
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                if (nums[i][j] == 0) {
                    nums[i][j] = (int) (Math.random() * 9) + 1;
                }
            }
        }

        System.out.println("Using for each loop ... ");
        // using for eacch
        for (int[] row : nums) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        NormalArray();
        System.out.println();
        System.out.println("Jagged Array....");
        JaggedArray();
    }
}

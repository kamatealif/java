public class App {
    public static void main(String[] args) throws Exception {
        int nums[][]= new int[3][4];


        // lets generate the random numbers for the 2d array 
      for(int i = 0; i < 3; i ++ ){

        for( int j = 0; j < 4; j++){
            nums[i][j] =(int) (Math.random() * 10);
            if (nums[i][j] == 0){
                nums[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
      }


        // displaying the 2d array
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}

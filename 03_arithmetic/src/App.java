public class App {
    public static void main(String[] args) throws Exception {
        // Arithmetic operations

        int num1 = 10;
        int num2 = 20;

        int addition = num1 + num2;
        System.out.println("addition : " + addition);

        int substraction = num1 - num2;
        System.out.println("substraction : " + substraction);

        int multiplication = num1 * num2;
        System.out.println("multiplication : " + multiplication);

        int devidation = num1 / num2;
        System.out.println("devidation : " + devidation);

        int modulo = num1 % num2;
        System.out.println("modulo : " + modulo);

        int incremental = num1++;
        System.out.println("incremental : " + incremental);

        int decremental = num1--;
        System.out.println("decremental : " + decremental);

        // Augmented Assingment Operator

        int num3 = 10;
        int num4 = 40;

        num3 = num3 + num4;
        // but we can also do this
        num3 += num4;
        // also for other arithmetic operators as well
        num3 -= num4;
        num3 *= num4;
        num3 /= num4;
        num3 %= num4;
        System.out.println("Augmented Assignment Operator : " + num3);

        // arithmetci by precidence  [P-E-M-D-A-S]
        int result = 3 + 4 - ( 7 - 5) *2;
        //          = 3 + 4 - ( 7 - 5) *2;
        //          = 3 + 4 - 4;
        //          = 3;
        System.out.println("Arithmetci by precidence : " + result);
    }
}

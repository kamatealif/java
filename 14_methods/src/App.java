import java.util.Scanner;

class Calculator {
    public int add(int num1, int num2) {
        System.out.println("Inside the Add function");
        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        if (num1 == 0) {
            System.out.println("Can't devide number by zero");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public int add(int num1, int num2){
        return num1 + num2
    }

    // what if we need to pass more parameters than 2 simply we can create a same
    // method with 3 parameters
    public int add(int num1, int num2, int num3){
        return num1 + num2 + num2
    }

    // this possible and i njava we called this is an a method overloading
}

class App {
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      Calculator instance = new Calculator();

      int num1 = 10;
      int num2 = 20;
    System.out.println("Enter a number  between 1 - 4 ");
      String choice = scanner.nextLine();

      switch (choice){
          case "1":
            int result = instance.add(num1, num2);
            System.out.println("Addition is: "  + result);
            break;
          case "2":
              System.out.println("Substraction is: "  +  instance.substract(num1, num2));
              break;
          case "3":
              System.out.println("Multiplication is: "  +  instance.multiplication(num1, num2));
              break;
          case "4":
              System.out.println("Division is: "  +  instance.division(num1, num2));
              break;
          default:
              System.out.println("Enter a number between 1 - 4");

      }
      int r1 = instance.add(10,20)

      int r2 =  instance.add(10,20,30)

      scanner.close();

  }
}
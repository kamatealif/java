class Calculator {
    public int add(int num1, int num2){
        System.out.println("Inside the Add function");
        return num1 + num2;
    }
}

class App{
  public static void main(String args[]){

      Calculator instance = new Calculator();
      int result = instance.add(84, 26);

      System.out.println("The Result is: "+ result);
  }
}
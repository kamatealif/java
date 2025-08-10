class Computer{
    public void playMusic(){
        System.out.println("Playing Music!...");
    }

    public String getMeAPen(int cost){
        if (cost >= 10)
            return "pen..🖋️";


        return "Nothing... 🙅🏼‍♂️";

    }
}

class Calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }

//    this is called method overloading
    public int add(int num1, int num2, int num3){
        return num1 + num2 + num2;
    }

}
class App {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 45;
        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);
        // int result = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);

        Computer obj = new Computer();

        obj.playMusic();
        String r = obj.getMeAPen(2);
        System.out.println(r);

        System.out.println(obj); // this gives memory address where the obj is stored
    }
}
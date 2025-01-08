public class Main {

    // datatypes 
    //primitive : the data which are stored into the stack
    // non-primitive : the data which are stored into the heap

    // primitive
    // 1) int
    // 2) double 
    // 3) char
    // 4) boolean 

    // non primitive(reference)
    // 1) String
    // 2) Array
    // 3)Objects
    public static void main(String[] args){
        
        System.out.println("Int....");
        int age = 21;
        int marks = 98;
        int price = 99; // in rupees
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Price : " + price + " rupees");
        System.out.println("\n");

        System.out.println("Double....");
        double price2 = 99.99;
        System.out.println("Price : " + price2 + " rupees");

        System.out.println("\n");
        System.out.println("Char....");
        char gender = 'M';
        System.out.println("Gender : " + gender);           

        System.out.println("\n");
        System.out.println("Boolean....");
        boolean isMarried = false;
        System.out.println("Married : " + isMarried);
        
        // non primitive
        System.out.println("\n");
        System.out.println("Strings...");
        String name = "alif";
        System.out.println("Name : " + name);

    }
}

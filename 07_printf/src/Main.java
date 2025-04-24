public class Main{
    public static void main(String[] args){
//        printf - is a method use to format output
//            %[flag][width][.precision][specifier-character]
            String name ="Spongebob";
            char firstLetter = 'S';
            int age = 30;
            double height = 60.5;
            boolean isEmployed = true;

            System.out.printf("Hello %s\n", name);
            System.out.printf("Your name starts with a %c\n", firstLetter);
            System.out.printf("Your are %d years old\n", age);
            System.out.printf("Your height is %f inches\n", height);
            System.out.printf("Employed: %b\n",isEmployed);

            System.out.printf("%s is %d years old\n", name,age);

//            Precision
            double price1 = 9000.99;
            double price2 = 10000.15;
            double price3 = -54000.01;
            System.out.printf("%.1f\n", price1);
            System.out.printf("%.2f\n", price2);
            System.out.printf(".3%f\n", price3);

//            flags
            // + = output a plus
            // , = comma grouping seprator
            // ( = negative numbers are enclosed in ()
            // space = display a minus if negative, space is possible
            System.out.printf("%+.1f\n", price1);
            System.out.printf("%,2f\n", price2);
            System.out.printf("%(.2f\n", price3);
            System.out.printf("% .2f\n", price1);

            // width
            int id1 = 1;
            int id2 = 23;
            int id3 = 456;
            int id4 = 7890;
            System.out.printf("%04d\n",id1);
            System.out.printf("%04d\n",id2);
            System.out.printf("%04d\n",id3);
            System.out.printf("%04d\n",id4);
    }

}
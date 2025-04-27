public class App{
    public static void main(String[] args){

        boolean isStudent = false;
        boolean isSenior = true;
        double ticketPrice = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a student and senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                ticketPrice = ticketPrice * 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                ticketPrice = ticketPrice * 0.9;
            }
        }
            
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 10%");
                ticketPrice = ticketPrice * 0.9;
            }
            else{
                System.out.println("You get no discount");
            }
        }

        System.out.println("The Ticket price is: " + ticketPrice);
    }
}
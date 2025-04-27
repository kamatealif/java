public class App{
    public static void main(String[] args){

        boolean isStudent = true;
        // boolean isSeniorCitizen;
        double ticketPrice = 9.99;

        if(isStudent){
            System.out.println("You get a student discount of 10%");
            ticketPrice = ticketPrice * 0.9;
        }
        else{
            ticketPrice = ticketPrice * 1.0;
        }

        System.out.println("The Ticket price is: " + ticketPrice);
    }
}
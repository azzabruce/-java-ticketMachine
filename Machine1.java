package assignment2_000791091;

import java.util.Scanner;

public class Machine1 {


        // assign a new integer type variable to store credit and set it to zero
        double credit = 0;

        //assign an int type variable that reflects the total amount needed to pay to purchase tickets from route 1
        private double balanceRoute1 = 0;

        //assign an int type variable that reflects the total amount needed to pay to purchase tickets from route 1
        private double balanceRoute2 = 0;

        //assign an integer type variable that stores # of adult tickets selected and set it to zero

        private int adult = 0;

        //assign an integer type variable that stores # of adult tickets selected and set initial value  to zero

        private int child = 0;

        //assign a string type variable to store route selection

        private String route1 = "Toronto";
        //assign a string type variable to store route selection

        private String route2 = "Hamilton";

        private String route;


        //assign instance for quarter, loonie and toonie
        private double quarter = 0.25 ;
        private double loonie = 1.00;
        private double toonie = 2.00;

        //set ticket prices for child and adult

        private double adultRoute1Price = 5.50;
        private double childRoute1Price = 2.50;

        private double adultRoute2Price = 5.00;
        private double childRoute2Price = 2.00;

    /** select destination Toronto
     * route Toronto
     * */

    public  void torontoRoute(){ this.route = route1;}

    /** select destination Hamilton
     * route Hamilton
     * */

    public  void hamiltonRoute(){ this.route1 = route2;
       adultRoute1Price = adultRoute2Price;
       childRoute1Price = childRoute2Price;
    }

    /** create a  Method for machine1 class
     * to increase the number of adult tickets by 1
     *
     * */

    public void addAdult(){ this.adult++;}


    /** create a  Method for machine1 class
     * to decrease the number of adult tickets by 1
     * */
    public void removeAdult(){ this.adult--;}

    /** create a  Method for machine1 class
     * to increase the number of children tickets by 1
     * */
    public void addChild(){ this.child++;}


    /** create a  Method for machine1 class
     * to decrease the number of children by 1
     * */

    public void removeChild(){ this.child--;}

    /** create a Method for machine1 class
     * to add quarters and show credit total
     * */
    public void addQuarter(){ credit = credit + quarter;}

    /** create a Method for machine1 class
     * to add loonies and show credit total
     * */
    public void addLoonies(){ credit = credit + loonie;}

    /** create a Method for machine1 class
     * to add loonies and show credit total
     * */
    public void addToonies(){ credit = credit + toonie;}





    /** create a Method for machine2 class
     * to print ticket if all conditions are met, otherwise print error
     * */
    public void printTicket(){
        int totalAdultTickets = adult;
        int totalChildrenTickets = child;

        //calculate the balance from route 1 and route 2 to compare to credit

        balanceRoute1 = (totalAdultTickets * adultRoute2Price) + (totalChildrenTickets * childRoute1Price);
        balanceRoute2 = (totalAdultTickets * adultRoute2Price) + (totalChildrenTickets * childRoute2Price);

        if ((adult >= 1 || child >= 1) && credit >=  balanceRoute1 ){
            System.out.println("Ticket Printed!");
            credit = 0; // reset credit to 0
            adult = 0;// reset adult
            child = 0;
        } else if ((adult >= 1 || child == 1) && credit >= balanceRoute2) {
            System.out.println("Ticket Printed!");
            credit = 0; // reset credit to 0
            adult = 0; // reset child tickets to 0
            child = 0;
            System.out.println("your credit is now: !" + credit);
        }else if ((adult >= 1 || child >= 1) && credit <  balanceRoute1) {
            System.out.println("You do not have enough credit to purchase selected tickets!");

        }else if ((adult >= 1 || child >= 1) && credit <  balanceRoute2) {
            System.out.println("You do not have enough credit to purchase selected tickets!");
        } else if (adult <= 0 && child <= 0){
            System.out.println("No ticket selected. Please choose at least one adult or a child ticket!");

        }else if (adult <= 0 && child <= 0){
            System.out.println("No ticket selected. Please choose at least one adult or a child ticket!");

        }
    }

    /**
     *
     * @return the buttons interface for machine 1
     */

    public String toString(){

        //display  a window that has selected routes, price of child and adult tickets
        //# of children tickets selected
        //# of adult tickets selected
        //credit amount

        return "\n" +
                "****************************************************************\n" +
                "Selected Route: " + route1 + "\tChild: $" + childRoute1Price  + "\tAdult: $" + adultRoute1Price+ "\n" +
                "Children: " + child + "\tAdults: " + adult + "\n" +
                "Credit: $" + credit + "\n" +
                "****************************************************************\n" ;


        }

    }














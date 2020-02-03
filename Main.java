package assignment2_000791091;
import java.util.*;



/** Creating two Ticket Machines that has two routes buttons, two buttons to add either +- a child fair,
 * +- an adult fair, shows user the total credit applied and to print ticket option
 * @author Azza Bruce
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        // define a string called input

        //create a new instance from class Scanner to read user's input in the system
        Scanner input = new Scanner(System.in);

        //assign a new integer type variable to store user's choice
        int choice;

        //create initial menu for user interface

    System.out.print("Welcome! Please head either to Machine 1 or Machine 2 to to purchase your ticket\n" +
            "1. Ticket Machine 1\n" +
            "2. Ticket machine 2\n" +
            "3.Exit.\n" +
            "Your choice: ");
        Machine1 machine1 = new Machine1();
        Machine2 machine2 = new Machine2();
        //get readers choice
        choice = input.nextInt();

        if (choice == 1){

            do {
                //output the current user interface menu
                System.out.print(machine1);
                System.out.print(" 1. Select Route 'Toronto'\n" +
                        " 2. Select Route 'Hamilton'\n" +
                        " 3. Add Adult\n" +
                        " 4. Remove Adult\n" +
                        " 5. Add Child\n" +
                        " 6. Remove Child\n" +
                        " 7. Insert Quarter\n" +
                        " 8. Insert Loonie\n" +
                        " 9. Insert Toonie\n" +
                        "10. Print Ticket\n" +
                        "11. Step away from machine\n" +
                        "Your choice: ");
                choice = input.nextInt();
                if (choice == 1) {
                    machine1.torontoRoute();

                } else if (choice == 2) {
                    machine1.hamiltonRoute();

                } else if (choice == 3 ){
                    machine1.addAdult();

                } else if (choice == 4 ) {
                    machine1.removeAdult();

                } else if (choice == 5 ) {
                    machine1.addChild();

                }else if (choice == 6 ) {
                    machine1.removeChild();

                }else if (choice == 7 ) {
                    machine1.addQuarter();

                }else if (choice == 8 ) {
                    machine1.addLoonies();

                }else if (choice == 9 ) {
                    machine1.addToonies();
                }else if (choice == 10){
                    machine1.printTicket();
                }
            }while (choice != 11);
        } else if (choice == 2){

            do {
                //output the current user interface menu
                System.out.print(machine2);

                System.out.print(" 1. Select Route 'Toronto'\n" +
                        " 2. Select Route 'Hamilton'\n" +
                        " 3. Add Adult\n" +
                        " 4. Remove Adult\n" +
                        " 5. Add Child\n" +
                        " 6. Remove Child\n" +
                        " 7. Insert Quarter\n" +
                        " 8. Insert Loonie\n" +
                        " 9. Insert Toonie\n" +
                        "10. Print Ticket\n" +
                        "11. Step away from machine\n" +
                        "Your choice: ");
                choice = input.nextInt();
                if (choice == 1) {
                    machine2.torontoRoute();

                } else if (choice == 2) {
                    machine2.hamiltonRoute();

                } else if (choice == 3 ){
                    machine2.addAdult();

                } else if (choice == 4 ) {
                    machine2.removeAdult();

                } else if (choice == 5 ) {
                    machine2.addChild();

                }else if (choice == 6 ) {
                    machine2.removeChild();

                }else if (choice == 7 ) {
                    machine2.addQuarter();

                }else if (choice == 8 ) {
                    machine2.addLoonies();

                }else if (choice == 9 ) {
                    machine2.addToonies();
                }else if (choice == 10){
                    machine2.printTicket();
                }
            }while (choice != 11);
        }





        if ( choice == 1){

            //System.out.print(choice);
            System.out.print(machine1);


            //choice = input.nextInt();
        }else if(choice == 3) {
            System.out.println("Exiting...");
            Thread.sleep(3000);

        }

        System.out.println("Exiting...");
        }



    }


//TicketMachine t1 = new TicketMachine(2.5, 1.50); You can set a constructor
//t1.setAdultTicketPrice(2.50);
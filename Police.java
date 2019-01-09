/**
 * This is a class representing the police officers of this city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

 // This class is going to involve user input
import java.util.Scanner;   

public class Police extends Person implements Employee {

    /**
     *  Put an enum defining the 4 different ranks of police officers in this city
     */
    public enum Role {
        PATROL, SARGENT, CAPTAIN, CHIEF;
    }

    // Member variables
    private Role rank;                  // Set aside data for this Police object to have a rank
    private String employeeID;          // A member variable to hold this officer's id number 
    
    // Constructors

    Police() {}
    /**
     * Initialize a Police officer given his/her specific rank
     * @param Rank specifies this officer's position
     */
    Police(String Rank) {
        Role Holder;
        if (Rank == "Patrol") {
            Holder = Role.PATROL;
            rank = Holder;
        }
        else if (Rank == "Sargent") {
            Holder = Role.SARGENT;
            rank = Holder;
        }
        else if (Rank == "Captain") {
            Holder = Role.CAPTAIN;
            rank = Holder;
        }
        else {
            Holder = Role.CHIEF;
            rank = Holder;
        }
    }

    // Getters

    /**
     * We need to know this officer's id number
     * @return this Police object's identification number
     */
    public String getIDNumber() { return employeeID; }
    /**
     * We need to know this officer's rank
     * @return this Police object's current rank
     */
    public Role getRank() { return rank; }

    // Employee interface implementation

    /**
     * This method pays this Police object based off of their rank
     */
    public void payEmployee() {
        /*
        This pay structure is a bit arbitrary.  I guessed as to a biweekly salary of these 
        police positions.  I could envision this computer program evolving to include a bank 
        database in which case this method might be revised and advanced to automatically
        deposit a paycheck amount into a specific employee's bank account.  For now though,
        we'll keep it this way.  This void method check's this employee's rank (from the enum list)
        and based off of rank, outputs to the screen their pay amount
        */
        if (rank == Role.PATROL){
            System.out.print("Your paycheck is $1,500.  Great work!");
        }
        else if (rank == Role.SARGENT) {
            System.out.print("Your paycheck is $2,000.  Nice job sargent!");
        }
        else if (rank == Role.CAPTAIN) {
            System.out.print("Your paycheck is $3,000.  Keep it up Captain!");
        }
        else {
            System.out.print("Your paycheck is $4,000.  Thanks Chief!");
        }
    }
    /**
     * This method asks the officer for his/her employee number, captures it and saves 
     * it into his/her private member variable
     */
    public void getIdNumber() {
        // Open a Scanner object to receive user input
        Scanner idHolder = new Scanner(System.in);
        // Prompt the user for their ID number
        System.out.println("Please tell me your employee number: ");
        // Save this value within this Police object's private data using our Scanner object method nextLine()
        employeeID = idHolder.nextLine();
        // Close the Scanner object
        idHolder.close();
    }

}
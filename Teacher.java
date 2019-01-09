/**
 * This is a class defining the teachers of this city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

 // This class is going to involve user input
import java.util.Scanner;   

public class Teacher extends Person implements Employee {

    // Member variables
    private int gradeLevel;             // What grade does this Teacher object teach?
    private String certification;       // PHD, Master's degree or Bachelors?
    private String employeeID;          // What's this teacher's employee number?

    // Constructors

    Teacher() {}
    /**
     * Initialize a new teacher based off of his/her current grade level and certification
     * @param grade_level specifies what grade this Teacher object is currently teaching
     * @param Certification specifies this Teacher object's current level of education 
     */
    Teacher(int grade_level, String Certification) {
        gradeLevel    = grade_level;
        certification = Certification;
    }

    // Setter

    /**
     * Allow teachers who advance in their education to update their certification
     * @param upgrade specifies the upgraded certification
     */
    public void setCert(String upgrade) { certification = upgrade; }

    // Getters

    /**
     * We need to know what grade level this teacher is currently teaching
     * @return this Teacher object's current grade level
     */
    public int getGradeLevel() { return gradeLevel; }
    /**
     * We need to know what certification this teacher currently has
     * @return this Teacher object's current certification
     */
    public String getCertification() { return certification; }
    /**
     * We need to know this teacher's id number
     * @return this Teacher object's current identification number
     */
    public String getIDNumber() { return employeeID; }
    
    // Employee interface implementation

    /**
     * This method pays this teacher based off of his/her certification
     */
    public void payEmployee() {
        /*
        This pay structure is a bit arbitrary.  I guessed as to a monthly salary for teachers
        based off of a general degree versus a Master's degree.
        I could envision this computer program evolving to include a bank 
        database in which case this method might be revised and advanced to automatically
        deposit a paycheck amount into a specific teacher's bank account.  For now though,
        we'll keep it this way.  This void method check's whether this teacher has a Master's degree
        or just a general Bachelor's degree and sends a message regarding their paycheck based off 
        of that information.
        */
        if (this.certification == "PhD"){
            System.out.println("Your paycheck is $7,000.  Thank you for all that you do!");
        }
        else if (this.certification == "Master's Degree") {
            System.out.println("Your paycheck is $5,000.  Thank you for all that you do!");
        }
        else {
            System.out.println("Your paycheck is $4,000.  Thank you for all that you do!");
        }
    }
    /**
     * This method asks the teacher for his/her employee number, captures it and saves 
     * it into his/her private member variable 
     */
    public void getIdNumber() {
        /*
        This method asks the teacher for his/her employee number
        and then takes that number and saves it as a string value into
        a Teacher private member variable
        */
        // Open a Scanner object to receive user input
        Scanner idHolder = new Scanner(System.in);
        // Prompt the user for their ID number
        System.out.println("Please tell me your employee number: ");
        // Save this value within this Teacher object's private data using our Scanner object method nextLine()
        employeeID = idHolder.nextLine();
        // Close the Scanner object
        idHolder.close();
    }

}
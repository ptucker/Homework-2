/**
 * This is a class defining the school in this city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

public class School extends Building {

    // Member variables
   private Person [] currentOccupants;          // This member variable is an array of Person objects because the school has both teachers and kids

    // Constructors

    School() {}
    
    /**
     * Initialize a new school given an array of teachers and students
     * @param occupants gives an array of Teacher and Kid objects to populate the school
     */ 
    School(Person [] occupants) {
        currentOccupants = occupants;
    }

    // Setter

    /**
     * Create a way for adding teachers and students to our school
     * @param occupant is the Teacher or Kid object to be added to the array of Person objects comprising the school 
     */
    public void addOccupants(Person occupant) {             // It takes the new teacher or kid object as a parameter
        int currentSize = currentOccupants.length;          // Creates an int variable to hold the current length of the array of teachers/kids
        int newSize = currentSize + 1;                      // Also creates an int variable 1 bigger than the current size to account for the addition
        Person [] newOccupantArray = new Person[newSize];   // Create a new array that is 1 bigger than the current array size
        for (int i=0; i < currentSize; i++) {               // Populate the new array with the current teachers and students
            newOccupantArray[i] = currentOccupants[i];
        }
        newOccupantArray[newSize- 1] = occupant;            // Give this new array the Person we are adding to the school at the last index location
        currentOccupants = newOccupantArray;                // Reassign this updated array to our currentOccupants member variable
    }

    // Getters

    /**
     * We need to access the array of teachers and students from the school
     * @return the array of Teacher and Kid objects within the school
     */
    public Person [] getSchoolArray() { return currentOccupants; }
   
}
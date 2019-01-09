/**
 * This is a class defining City Hall
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

public class CityHall extends Building {

    // Member variables
    //PT -- ArrayList<Police> will work better. Can ordinary People come to City Hall?
    private Police [] currentOccupants;         // An array member variable holding the Police objects contained within CityHall
    String name;                                // Name of the City Hall

    // Constructors

    CityHall() {}
    
    /**
     * Initialize a CityHall object given an array of Police officers
     * @param occupants gives an array of Police objects to populate the City Hall
     */
    CityHall(Police [] occupants, String Name) {
        currentOccupants = occupants;
        name = Name;
    }

    // Setter

    /**
     * Create a way for adding an officer to City Hall
     * @param occupant is the Police object to be added to the officer array
     */
    //PT -- And ArrayList<Police> takes care of all of this for you.
    public void addOccupants(Police occupant) {             // It takes the new officer object as a parameter
        int currentSize = currentOccupants.length;          // Creates an int variable to hold the current length of the array of police officers
        int newSize = currentSize + 1;                      // Also creates an int variable 1 bigger than the current size to account for the addition
        Police [] newOccupantArray = new Police[newSize];   // Create a new array that is 1 bigger than the current array size
        for (int i=0; i < currentSize; i++) {               // Populate the new array with the current Police officers
            newOccupantArray[i] = currentOccupants[i];
        }
        newOccupantArray[newSize- 1] = occupant;            // Give this new array the officer we are adding to City Hall at the last index location
        currentOccupants = newOccupantArray;                // Reassign this updated array to our currentOccupants member variable
    }
    
    //PT -- remove occupant? -1

    // Getter

    /**
     * We need to access the array of police officers from the City Hall
     * @return the array of Police objects
     */
    public Police [] getPoliceArray() { return currentOccupants; }

}

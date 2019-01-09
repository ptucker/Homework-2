/**
 * This is a class to define buildings within the city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

public class Building {

    // Member variables
    private String name;                // What's this building's name?
    private String address;             // And it's physical address?

    // Constructors

    Building () {}
    
    /**
     * Initialize a new building 
     * @param Name specifies this Building object's name
     * @param Address specifies this Building object's physical address
     */
    Building (String Name, String Address) {
        name    = Name;
        address = Address;
    }

    // Getters

    /**
     * We need to get the name of the building
     * @return this Building object's name
     */
    public String getName() { return name; }
    /**
     * We need to get the address of the building
     * @return this Building object's address
     */
    public String getAddress() { return address; }

}
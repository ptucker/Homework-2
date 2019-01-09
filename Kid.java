/**
 * This is a class to represent the kids of this city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

public class Kid extends Person {
    
    // Member variables
    private String favCandy;

    // Constructors

    Kid() {}
    // Pass in this Kid object's favorite candy when instantiating the object
    /**
     * Initialize a child given his/her favorite candy
     * @param fav_candy specifies this Kid object's favorite candy
     */
    Kid(String fav_candy) { favCandy = fav_candy; }

    // Setters

    /**
     * Allow kids to change their mind regarding their favorite candy
     * @param newFavCandy specifies this Kid object's new favorite candy
     */
    public void setNewFavCandy(String newFavCandy) { favCandy = newFavCandy; }

    // Getter

    /**
     * We need to know this kid's favorite candy
     * @return this Kid object's favorite candy
     */
    public String getFavCandy() { return favCandy; }

}
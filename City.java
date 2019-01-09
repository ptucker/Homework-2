/**
 * A City class to model the different people and buildings within the city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

 // Because an ArrayList provides more functionality than an array, I'm going to import the ArrayList package
import java.util.ArrayList;

 public class City {

    // Private member variables
    private String name;                        // Name of the city
    private String state;                       // Which state within the US is this city?
    private static int population = 0;          // Amount of people residing in the city
    private CityHall cityHall;                  // This city has a city hall building
    private School [] schoolArray;              // An array of school's within the city
    private ArrayList<Kid> childArray;          // An arrayList containing the kids of the city
    private ArrayList<Teacher> teacherArray;    // An arrayList containing the teachers of the city
    private ArrayList<Police> policeArray;      // An arrayList containing the police officers of the city 

    // Constructors

    City() {}

    /**
     * Initialize this city with its name and the state it resides in
     * @param Name specifies the city name
     * @param State specifies the state in the US where this city is
     */
    City(String Name, String State) { 
        name  = Name;
        state = State;
    }

    // Setters

    /**
     * Allows for defining this city's City Hall
     * @param hall is the CityHall object of this city
     */
    public void setHall(CityHall hall) { cityHall = hall; }
    /**
     * Allows for loading the city's schools into the city
     * @param schools is the array containting this City object's local schools
     */
    public void setSchoolArray(School [] schools) { schoolArray = schools; }
    /**
     * Allows for loading the city's children into the city
     * @param kiddos
     */
    public void setKidArray(ArrayList<Kid> kiddos) { 
        childArray = kiddos;                // Give this City's Kid array this array
        int Holder = kiddos.size();         // Create a temporary holder variable and give assign it the amount of kids in the array
        population += Holder;               // Increment this city's population 
    }
    /**
     * Allows for loading the city's teachers into the city
     * @param teachers
     */
    public void setTeacherArray(ArrayList<Teacher> teachers) { 
        teacherArray = teachers;          // Give this City's Teacher array this array
        int Holder = teachers.size();     // Create a temporary holder variable and give assign it the amount of kids in the array
        population += Holder;             // Increment this city's population  
    }
    /**
     * Allows for loading the city's police officers into the city
     * @param officers
     */
    public void setPoliceArray(ArrayList<Police> officers) { 
        policeArray = officers;             // Give this City's Police array this array
        int Holder = officers.size();       // Create a temporary holder variable and give assign it the amount of kids in the array
        population += Holder;               // Increment this city's population  
    }
    


    // Getters

    /**
     * Allow for accessing this city's name
     * @return the name of this City object
     */
    public String getName() { return name; }
    /**
     * Allow for accessing this city's state
     * @return the state that this City object is located in
     */
    public String getState() { return state; }
    /**
     * Allow for accessing the current population of the city
     * @return the current population of this City object
     */
    public int getPop() { return population; }

    // Information methods

    /**
     * This method uses loops to output all of the names of the people in the city to the screen
     */
    public void printCitizens() {
        // Start the process of outputting the names of the citizens of this city by using a loop to output the kids' names
        System.out.println("Let's start by giving the names of the kids in this city: ");
        for(int i = 0; i < childArray.size(); i++) {
            Kid Holder = childArray.get(i);
            System.out.println(childArray.get(i));
        }
        // Next we'll use a loop to output the teachers' names
        System.out.println("Now let's see the names of the teachers in this city: ");
        for(int i = 0; i < teacherArray.size(); i++) {
            System.out.println(teacherArray.get(i));
        }
        // And lastly we use a loop to output the names of the police officers in this city
        System.out.println("Finally, let's see the police officers in this city: ");
        for(int i = 0; i < policeArray.size(); i++) {
            System.out.println(policeArray.get(i));
        }
    }
    /**
     * This method outputs the name of this city's City Hall and then uses a loop 
     * to output all of the names of the different schools in the city
     */
    public void printBuildings() {
        System.out.println("The local municipal building of this city is: " + cityHall.name);
        System.out.println("The buildings in this city are: ");
        for(int i = 0; i < schoolArray.length; i++) {
            System.out.println(schoolArray[i]);
        }
    }

}
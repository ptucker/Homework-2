/**
 * This is a base class for people who live in this city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

public class Person {

// Private member variables    
private String name;
private int age;
private String phoneNumber;

// Constructors

Person() {}
/**
 * @param Name  specifies the name of this Person object
 * @param Age   specifies the age of this Person object
 * @param phone_number  specifies the phone number of this person object
 */
Person(String Name, int Age, String phone_number) {
    name        = Name;
    age         = Age;
    phoneNumber = phone_number;
}

// Setters

/**
 * Set this person's name to its updated version
 * @param Name specifies what that new name is
 */
public void setName(String Name) { name = Name; } 
/**
 * This person had a birthday and we need to update his/her age
 * @param Age specifies his/her new age
 */                         
public void setAge(int Age) { age = Age; }
/**
 * This person changed their phone number and we need to update it
 * @param phone_number specifies the new number 
 */                                 
public void setNumber(String phone_number) { phoneNumber = phone_number; } 

// Getters

/**
 * We need to access this person's name
 * @return this Person object's name
 */
public String getName() { return name; }
/**
 * We need to access this person's age
 * @return this Person object's current age
 */
public int getAge() { return age; }
/**
 * We need to access this person's phone number
 * @return this Person object's current phone number
 */
public String getNumber() { return phoneNumber; }

}
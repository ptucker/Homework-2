import java.util.ArrayList;

/**
 * A test class to test the functionality of this city
 * @author Shane Snediker
 * @version 1.0 January 8, 2019
 */

 /*
    This test class is really ugly.  I just ran out of time and didn't want to quit before I 
    finished the test class so that I could at least see how my implementation ended up 
    panning out.  So, I ended up building Person and Building objects quickly to try to 
    flesh out the data needed to run my city, but even that I didn't do very well.
 */

public class CityTest {
    public static void main(String [] args) {

    // Let's start by creating our children
    Kid One       = new Kid("Skittles");
    One.setName("Larry");
    Kid Two       = new Kid("Snickers");
    Two.setName("Bill");
    Kid Three     = new Kid("Gobstoppers");
    Three.setName("Sally");
    Kid Four      = new Kid("Almond Joy");
    Four.setName("Johnny");
    Kid Five      = new Kid("Gummy Bears");
    Five.setName("Theresa");
    Kid Six       = new Kid("Sour Patch Kids");
    Six.setName("Tom");
    Kid Seven     = new Kid("Swedish Fish");
    Seven.setName("Terry");
    Kid Eight     = new Kid("Butterfinger");
    Eight.setName("Gary");
    Kid Nine      = new Kid("Mike and Ike");
    Nine.setName("Joann");
    Kid Ten       = new Kid("Jellybeans");
    Ten.setName("Francesca");
    Kid Eleven    = new Kid("Jawbreakers");
    Eleven.setName("Brea");
    Kid Twelve    = new Kid("Skittles");
    Twelve.setName("Jewels");
    ArrayList<Kid> KiddoArray = new ArrayList<Kid>();
    KiddoArray.add(One);
    KiddoArray.add(Two);
    KiddoArray.add(Three);
    KiddoArray.add(Four);
    KiddoArray.add(Five);
    KiddoArray.add(Six);
    KiddoArray.add(Seven);
    KiddoArray.add(Eight);
    KiddoArray.add(Nine);
    KiddoArray.add(Ten);
    KiddoArray.add(Eleven);
    KiddoArray.add(Twelve);


    // Create some teachers
    Teacher elementary = new Teacher(6, "Bachelor's Degree");
    elementary.setName("Mrs. Jones");
    Teacher MiddleSchool = new Teacher(9, "Bachelor's Degree");
    MiddleSchool.setName("Mr. Murphey");
    Teacher HighSchool = new Teacher(12, "Master's Degree");
    HighSchool.setName("Mr. Mickleson");
    Teacher college = new Teacher(14, "Phd");
    college.setName("Mrs. Johnson");
    ArrayList<Teacher> TeacherArray = new ArrayList<>();
    TeacherArray.add(elementary);
    TeacherArray.add(MiddleSchool);
    TeacherArray.add(HighSchool);
    TeacherArray.add(college);

    // Create some police officers
    Police officer1 = new Police("Patrol");
    officer1.setName("Dillon");
    Police officer2 = new Police("Patrol");
    officer2.setName("Franky");
    Police officer3 = new Police("Patrol");
    officer3.setName("Mary");
    Police officer4 = new Police("Sargent");
    officer4.setName("Timothy");
    Police officer5 = new Police("Sargent");
    officer5.setName("Adam");
    Police officer6 = new Police("Captain");
    officer6.setName("Justin");
    Police officer7 = new Police("Chief");
    officer7.setName("Andrew");
    ArrayList<Police> PoliceArray = new ArrayList<>();
    PoliceArray.add(officer1);
    PoliceArray.add(officer2);
    PoliceArray.add(officer3);
    PoliceArray.add(officer4);
    PoliceArray.add(officer5);
    PoliceArray.add(officer6);
    PoliceArray.add(officer7);

    // Array of Person objects to give to our school
    Person [] elementaryPersonnel = { elementary, One, Two, Three, Four };
    Person [] middleSchoolPersonnel = { MiddleSchool, Five, Six, Seven };
    Person [] highSchoolPersonnel = { HighSchool, Eight, Nine, Ten };
    Person [] collegePersonnel = { college, Eleven, Twelve };

    // Create the schools
    School SpragueElementary = new School(elementaryPersonnel);
    School SpragueMiddle = new School(middleSchoolPersonnel);
    School SpragueHigh = new School(highSchoolPersonnel);
    School SpragueCC = new School(collegePersonnel);
    School [] schoolArray = { SpragueElementary, SpragueMiddle, SpragueHigh, SpragueCC };

    // Array of Police objects to populate City Hall
    Police [] officerArray = {officer1, officer2, officer3, officer4, officer5, officer6, officer7 };

    // Create the City Hall
    CityHall theCityHall = new CityHall(officerArray, "Sprague City Hall");

    // Create the City
    City Sprague = new City("Sprague", "Washington");

    // Let's test the functionality of paying the employees
    officer3.payEmployee();
    officer5.payEmployee();
    officer6.payEmployee();
    officer7.payEmployee();
    elementary.payEmployee();
    MiddleSchool.payEmployee();
    HighSchool.payEmployee();
    college.payEmployee();

    // And check to see if the function requesting identification numbers is working
    officer1.getIDNumber();
    college.getIDNumber();

    // And set some more things straight
    Sprague.setHall(theCityHall);
    Sprague.setSchoolArray(schoolArray);
    Sprague.setKidArray(KiddoArray);
    Sprague.setTeacherArray(TeacherArray);
    Sprague.setPoliceArray(PoliceArray);

     // Let's get some information
     Sprague.printCitizens();
     Sprague.printBuildings();

    }
}
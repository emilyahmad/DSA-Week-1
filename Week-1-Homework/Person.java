/*
 * @author: Emily Ahmad
 * 
 * @Date Modified: 9/8/2025
 * Purpose: Homework Problems 2-4
 */

public class Person {
    // private instance variables
    private String firstName;
    private String lastName;
    private int uniqueID;

    // keeps track of last assigned ID
    private static int lastAssignedID = 1000;

    // default constructor
    public Person() {
        this.firstName = "";
        this.lastName = "";
        lastAssignedID++;
        this.uniqueID = lastAssignedID;
    }

    // overloaded constructor
    public Person(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        lastAssignedID++;
        this.uniqueID = lastAssignedID;
    }

    // accessor methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    // print methods
    public void printFirstName() {
        System.out.println("First Name: " + firstName);
    }

    public void printLastName() {
        System.out.println("Last Name: " + lastName);
    }

    public void printUniqueID() {
        System.out.println("Unique ID Number: " + uniqueID);
    }

    // toString method
    public String toString() {
        return "Person attributes:\nFirst Name; " + firstName +
                "\nLast Name: " + lastName + "\nUnique ID Number: "
                + uniqueID;
    }

    public class PersonTester {
        public static void main(String[] args) {
            Person dummy = new Person();
            System.out.println(dummy);
            dummy.printFirstName();
            dummy.printLastName();
            dummy.printUniqueID();

            Person me = new Person("Emily", "Ahmad");
            System.out.println(me);
        }
    }
}
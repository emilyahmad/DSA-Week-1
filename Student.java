import java.util.ArrayList;

public class Student extends Person {
    // private instance variables
    String department;
    ArrayList<String> classesTaken = new ArrayList<String>();
    ArrayList<Character> grades = new ArrayList<Character>();

    /*
     * The student class should contain the necessary
     * methods to print the transcript for each student.
     */

    public Student(String firstName, String lastName, String department) {
        super(firstName, lastName);
        this.department = department;
        this.classesTaken = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addClass(String className, char grade) {
        classesTaken.add(className);
        grades.add(Character.toUpperCase(grade));
    }

    // accessor method
    public String getDepartment() {
        return department;
    }

    public ArrayList<String> getClassesTaken() {
        return new ArrayList<String>(classesTaken);
    }

    public ArrayList<Character> getGrades() {
        return new ArrayList<Character>(grades);
    }

    public void printTranscript() {
        System.out.println(getFirstName() + " " + getLastName() + "\'s Transcript, " + "ID: " + getUniqueID()
                + " Department: " + getDepartment());
        for (int i = 0; i < classesTaken.size(); i++) {
            System.out.println("Class: " + classesTaken.get(i) + ", grade in class: " + grades.get(i));
        }
    }
}
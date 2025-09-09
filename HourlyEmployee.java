// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class HourlyEmployee extends Person {
    private double hourlyRate;
    private int hoursWorked;
    private String department;

    public HourlyEmployee(String firstName, String lastName, String department, double hourlyRate, int hoursWorked) {
        super(firstName, lastName);
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getDepartment() {
        return department;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void printTotalHours() {
        System.out.println(getHoursWorked());
    }

    public void printAvgHoursWorkedWeekly() {
        double AvgHoursWorkedWeekly = getHoursWorked() / 4;
        System.out.println(AvgHoursWorkedWeekly);
    }

    public void printTotalWages() {
        double totalWages = getHoursWorked() * hourlyRate;
        System.out.println(totalWages);
    }

    public void printHourlyEmployeeInfo() {
        System.out.println(getFirstName() + " " + getLastName() + "\'s information, ID: " + getUniqueID());
        System.out.println("Department: " + getDepartment());
        System.out.println("Total hours worked (over the course of 4 weeks): " + getHoursWorked());
        System.out.println("Average hours worked weekly: " + getHoursWorked() / 4);
        System.out.println("Total wages (over 4 weeks): " + getHoursWorked() * hourlyRate);
    }

}

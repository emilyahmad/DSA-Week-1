// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String firstName, String lastName, String department, double hourlyRate, int hoursWorked) {
        super(firstName, lastName, department, hoursWorked);
        this.hourlyRate = hourlyRate;
    }

    public void printTotalWages() {
        double totalWages = getHoursWorked() * hourlyRate;
        System.out.println(totalWages);
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + "\'s information, ID: " + getUniqueID() + "\nDepartment: "
                + getDepartment() + "\nTotal hours worked (over the course of 4 weeks): " + getHoursWorked()
                + "\nAverage hours worked weekly: " + getHoursWorked() / 4 + "\nTotal wages (over 4 weeks): "
                + getHoursWorked() * hourlyRate;
    }

}

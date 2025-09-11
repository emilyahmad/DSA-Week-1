public class FulltimeEmployee extends Employee {
    private double salary;

    /*
     * The employee class should contain the necessary methods that will print the
     * total hours (four-week total), average hours per week worked by each
     * employee, and the total wages during a four-week period.
     */

    public FulltimeEmployee(String firstName, String lastName, String department, int hoursWorked, double salary) {
        super(firstName, lastName, department, hoursWorked);
        this.salary = salary;
    }

    public void printTotalWages() {
        // salary = wages over 52 weeks
        // 13/52 * salary = 4 weeks worth of wages
        double totalWages = salary / 13;
        System.out.println(totalWages);
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + "\'s information, ID: " + getUniqueID() + "\nDepartment: "
                + getDepartment() + "\nTotal hours worked (over the course of 4 weeks): " + getHoursWorked()
                + "\nAverage hours worked weekly: " + getHoursWorked() / 4 + "\nTotal wages (over 4 weeks): "
                + salary / 13;
    }

}
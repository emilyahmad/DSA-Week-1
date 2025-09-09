public class Employee extends Person {
    private String department;
    private int hoursWorked;

    public Employee(String firstName, String lastName, String department, int hoursWorked) {
        super(firstName, lastName);
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    public String getDepartment() {
        return department;
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
}
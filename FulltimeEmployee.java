public class FulltimeEmployee extends Person {
    private String department;
    private int salary;
}

    /*
     * The employee class should contain the necessary methods that will print the
     * total hours (four-week total), average hours per week worked by each
     * employee, and the total wages during a four-week period.
     */

    public FulltimeEmployee(String firstName, String lastName, String d, int s) {
        super(firstName, lastName);
        this.department = d;
        this.salary = s;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

}
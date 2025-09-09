public class EmployeeTester {
    public static void main(String args[]) {
        // Employee object test
        Employee Ethan = new Employee("Ethan", "Stuart", "Biology", 40);
        System.out.println(Ethan);
        Ethan.printTotalHours();
        Ethan.printAvgHoursWorkedWeekly();

        // Fulltime object test
        FulltimeEmployee Sarah = new FulltimeEmployee("Sarah", "Ahmad", "Finance", 52, 110100.10);
        System.out.println(Sarah);
        Sarah.printTotalWages();

        // Hourly object test
        HourlyEmployee Emily = new HourlyEmployee("Emily", "Ahmad", "Data Science", 16.50, 40);
        System.out.println(Emily);
        Emily.printTotalWages();
    }
}

public class PersonTester {
    public static void main(String[] args) {
        Person Ana = new Person("Ana", "Gotike");
        System.out.println(Ana);
        Ana.printFirstName();
        Ana.printLastName();
        Ana.printUniqueID();
    }
}
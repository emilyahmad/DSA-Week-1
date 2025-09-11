public class AddressBookTester {
    public static void main(String[] args) {
        AddressBook<Student> book = new AddressBook<>();

        Student s1 = new Student("Emily", "Ahmad", "CS");
        System.out.println("Add s1: " + book.add(s1));

        Student s2 = new Student("Elaina", "Sharrit", "Bio");
        System.out.println("Add s2: " + book.add(s2));

        System.out.println("Search first name 'Emily': " + book.searchByFirstName("Emily"));
        System.out.println("Search last name 'Sharrit': " + book.searchByLastName("Sharrit"));

        int id = s2.getUniqueID();
        System.out.println("\nFind by id " + id + ": " + book.findById(id));

        System.out.println("\nAll entries:");
        book.printAll();

        System.out.println("\nDelete s1: " + book.delete(s1)); // true
        System.out.println("All entries after delete:");
        book.printAll();
    }
}

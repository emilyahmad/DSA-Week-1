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
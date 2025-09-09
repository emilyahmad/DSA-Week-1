public class PersonTester {
    public static void main(String[] args) {
        Person dummy = new Person();
        System.out.println(dummy);
        dummy.printFirstName();
        dummy.printLastName();
        dummy.printUniqueID();

        Person me = new Person("Emily", "Ahmad");
        System.out.println(me);

        Student Sarah = new Student("Sarah", "Ahmad");
        Sarah.addClass("Macroeconomics", 'a');
        Sarah.addClass("Finance", 'a');
        Sarah.printTranscript();
    }
}
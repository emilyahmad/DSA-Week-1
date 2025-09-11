public class StudentTester {
    public static void main(String args[]) {
        Student Elaina = new Student("Elaina", "Sharitt", "Computer Science");
        Elaina.addClass("Calculus", 'a');
        Elaina.addClass("Government", 'a');
        Elaina.addClass("Programming", 'a');
        Elaina.addClass("Physics", 'b');
        Elaina.printTranscript();
    }
}
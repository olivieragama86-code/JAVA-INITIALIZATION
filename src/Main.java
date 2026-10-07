public class Main {
    public static void main(String[] args) {
        System.out.println("=== UNEB REGISTRATION SYSTEM STARTS ===");

        // Settings are loaded before any student is created
        ExamRegistration.ExamConfig.showSettings();

        System.out.println("\n--- Registering first student ---");
        ExamRegistration.Student s1 = new ExamRegistration.Student("Aisha Nakato");
        s1.display();

        System.out.println("\n--- Registering second student ---");
        ExamRegistration.Student s2 = new ExamRegistration.Student("Brian Okello");
        s2.display();

        System.out.println("Total students registered: " + ExamRegistration.Student.totalStudents);
    }
}
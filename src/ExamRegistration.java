public class ExamRegistration {

    // Runs ONCE for the whole application
    static class ExamConfig {
        static int examYear;
        static double registrationFee;
        static String gradingPolicy;

        static {
            System.out.println("[STATIC BLOCK] Loading exam settings (once)...");
            examYear = 2026;
            registrationFee = 50000;
            gradingPolicy = "Grade 1 to 9";
        }

        static void showSettings() {
            System.out.println("Exam Year: " + examYear);
            System.out.println("Fee: " + registrationFee + " UGX");
            System.out.println("Grading: " + gradingPolicy);
        }
    }

    static class Student {
        static int totalStudents;      // shared by all students
        String name;
        String registrationStatus;
        String examCentre;

        // Static block: runs ONCE, when class Student is first used
        static {
            System.out.println("[STATIC BLOCK] Student class ready (once).");
            totalStudents = 0;
        }

        // Instance block: runs EVERY time an object is created, before the constructor
        {
            System.out.println("[INSTANCE BLOCK] Setting default values...");
            registrationStatus = "Pending";
            examCentre = "Centre A";
        }

        // Constructor: runs EVERY time, after the instance block
        Student(String name) {
            System.out.println("[CONSTRUCTOR] Registering student: " + name);
            this.name = name;
            totalStudents++;
        }

        void display() {
            System.out.println("Name: " + name
                    + " | Status: " + registrationStatus
                    + " | Centre: " + examCentre
                    + " | Year: " + ExamConfig.examYear);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UNEB REGISTRATION SYSTEM STARTS ===");

        // Settings are loaded before any student is created
        ExamConfig.showSettings();

        System.out.println("\n--- Registering first student ---");
        Student s1 = new Student("Aisha Nakato");
        s1.display();

        System.out.println("\n--- Registering second student ---");
        Student s2 = new Student("Brian Okello");
        s2.display();

        System.out.println("Total students registered: " + Student.totalStudents);
    }
}
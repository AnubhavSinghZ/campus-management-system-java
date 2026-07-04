import entities.Course;
import entities.Faculty;
import entities.Person;
import entities.Student;
import exceptions.EnrollmentFullException;
import exceptions.InvalidGradeException;
import services.EnrollmentService;
import services.FeeService;
import services.GradeCalculator;
import utils.FileHandler;

/*
 * ============================================================
 *  CAMPUS MANAGEMENT SYSTEM - Entry Point
 *  Demonstrates AKTU CSE (AI & ML) 2nd Year OOP (Java) Syllabus
 * ============================================================
 * See README.md for the full concept-to-file mapping.
 *
 * Compile from the "src" folder:
 *      javac Main.java entities/*.java interfaces/*.java services/*.java exceptions/*.java utils/*.java
 * Run:
 *      java Main
 * ============================================================
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" CAMPUS MANAGEMENT SYSTEM (OOP DEMO)");
        System.out.println("========================================\n");

        // ---- Creating OBJECTS ----
        Student s1 = new Student("Aditi", 19, "B.Tech CSE (AI&ML)");
        Student s2 = new Student("Rohan", 20, "B.Tech CSE (AI&ML)");
        Student s3 = new Student("Kavya", 19, "B.Tech CSE (AI&ML)");
        Faculty f1 = new Faculty("Dr. Sharma", 45, "Computer Science", 95000.0);
        Course course = new Course("CS201", "Object Oriented Programming", 4);

        System.out.println("Course offered: " + course);

        // ---- Runtime Polymorphism: same reference type (Person),
        // different actual objects, different getRole()/toString() ----
        Person[] people = { s1, s2, f1 };
        System.out.println("\n--- Demonstrating Runtime Polymorphism ---");
        for (Person p : people) {
            System.out.println(p);
        }

        // ---- EnrollmentService: Collections (ArrayList/HashMap) ----
        EnrollmentService enrollmentService = new EnrollmentService();
        try {
            enrollmentService.enroll(s1);
            enrollmentService.enroll(s2);
            enrollmentService.enroll(s3);
        } catch (EnrollmentFullException e) {
            System.out.println("Enrollment error: " + e.getMessage());
        }
        enrollmentService.listAllStudents();

        // ---- FeeService: Interface implementation (Payable) ----
        System.out.println("\n--- Fee Payment (Interface: Payable) ---");
        FeeService feeService = new FeeService();
        feeService.payFee(s1, 50000);

        // ---- Attendance: Interface implementation (Attendable) ----
        System.out.println("\n--- Attendance (Interface: Attendable) ---");
        s1.markAttendance("2026-07-01");
        s1.markAttendance("2026-07-02");
        System.out.println(s1.getName() + " total classes attended: " + s1.getAttendanceCount());

        // ---- Method Overloading demo ----
        System.out.println("\n--- Demonstrating Method Overloading ---");
        GradeCalculator calc = new GradeCalculator();
        double p1 = calc.calculate(450, 500);
        double p2 = calc.calculate(new double[]{78, 85, 90, 60}, 100);
        System.out.println("Percentage (marks/total): " + p1);
        System.out.println("Percentage (array avg): " + p2);

        // ---- Custom Exception Handling demo ----
        System.out.println("\n--- Demonstrating Exception Handling ---");
        try {
            char grade = calc.getGrade(p1);
            System.out.println("Grade for " + s1.getName() + ": " + grade);

            char badGrade = calc.getGrade(150); // invalid on purpose
            System.out.println("This line will not run: " + badGrade);
        } catch (InvalidGradeException e) {
            System.out.println("Caught custom exception -> " + e.getMessage());
        } finally {
            System.out.println("Grade calculation attempt finished.");
        }

        // ---- HashMap lookup demo ----
        System.out.println("\n--- Demonstrating HashMap Lookup ---");
        Student found = enrollmentService.findById(s2.getStudentId());
        System.out.println("Found by ID " + s2.getStudentId() + ": " + (found != null ? found.getName() : "Not found"));

        // ---- Enrollment limit / custom exception demo ----
        System.out.println("\n--- Demonstrating EnrollmentFullException ---");
        try {
            enrollmentService.enroll(new Student("Extra1", 19, "CSE"));
            enrollmentService.enroll(new Student("Extra2", 19, "CSE")); // 5th student, still works
            enrollmentService.enroll(new Student("Extra3", 19, "CSE")); // exceeds capacity -> throws
        } catch (EnrollmentFullException e) {
            System.out.println("Caught custom exception -> " + e.getMessage());
        }

        // ---- File Handling demo ----
        FileHandler.saveStudentsToFile(enrollmentService.getAllStudents(), "student_records.txt");

        System.out.println("\n========================================");
        System.out.println(" PROGRAM END");
        System.out.println("========================================");
    }
}
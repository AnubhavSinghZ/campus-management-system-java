package entities;

import interfaces.Attendable;
import java.util.ArrayList;

/*
 * INHERITANCE: Student extends Person (single level)
 * Also implements Attendable interface -> a Student's
 * attendance can be tracked.
 */
public class Student extends Person implements Attendable {

    // STATIC MEMBER: shared across ALL Student objects.
    // Used to auto-generate a unique roll number for every
    // new student created.
    private static int counter = 1000;

    private final int studentId; // final -> set once in constructor, never changed
    private String course;
    private double feePaid = 0.0;
    private ArrayList<String> attendanceDates = new ArrayList<>();

    // CONSTRUCTOR (parameterized) + use of super()
    public Student(String name, int age, String course) {
        super(name, age);
        this.studentId = counter++;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public double getFeePaid() {
        return feePaid;
    }

    // Called by FeeService after processing a payment
    public void addPayment(double amount) {
        this.feePaid += amount;
    }

    // RUNTIME POLYMORPHISM (Method Overriding)
    @Override
    public String getRole() {
        return "Student";
    }

    // Implementing Attendable interface's method
    @Override
    public void markAttendance(String date) {
        attendanceDates.add(date);
        System.out.println("Attendance marked for " + getName() + " on " + date);
    }

    public int getAttendanceCount() {
        return attendanceDates.size();
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + studentId + ", Course: " + course
                + ", Fee Paid: Rs." + feePaid;
    }
}
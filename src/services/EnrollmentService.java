package services;

import entities.Student;
import exceptions.EnrollmentFullException;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * SERVICE CLASS: manages enrolling and looking up students.
 * Demonstrates COLLECTIONS: ArrayList (ordered list) and
 * HashMap (fast lookup by ID).
 */
public class EnrollmentService {

    private static final int MAX_CAPACITY = 5; // small limit just for demo

    private ArrayList<Student> studentList = new ArrayList<>();
    private HashMap<Integer, Student> studentMap = new HashMap<>(); // id -> Student

    public void enroll(Student s) throws EnrollmentFullException {
        if (studentList.size() >= MAX_CAPACITY) {
            throw new EnrollmentFullException("Cannot enroll " + s.getName() + " - class is full!");
        }
        studentList.add(s);
        studentMap.put(s.getStudentId(), s);
        System.out.println("Enrolled: " + s.getName() + " (ID: " + s.getStudentId() + ")");
    }

    public Student findById(int id) {
        return studentMap.get(id);
    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }

    public void listAllStudents() {
        System.out.println("\n--- All Enrolled Students ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
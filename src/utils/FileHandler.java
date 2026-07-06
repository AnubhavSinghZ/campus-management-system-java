package utils;

import entities.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/*
 * UTILITY CLASS demonstrating FILE HANDLING.
 * Saves a list of student records to a plain text file.
 */
public class FileHandler {

    // static method - no need to create a FileHandler object to use it
    public static void saveStudentsToFile(List<Student> students, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Student s : students) {
                writer.write(s.toString() + System.lineSeparator());
            }
            System.out.println("\nStudent records saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
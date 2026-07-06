package exceptions;

/*
 * CUSTOM CHECKED EXCEPTION
 * Thrown when trying to enroll a student into a class that
 * has already reached its maximum capacity.
 */
public class EnrollmentFullException extends Exception {
    public EnrollmentFullException(String message) {
        super(message);
    }
}
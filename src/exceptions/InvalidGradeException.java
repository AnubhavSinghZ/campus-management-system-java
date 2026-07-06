package exceptions;

/*
 * CUSTOM CHECKED EXCEPTION
 * Thrown when a percentage/grade value is impossible
 * (e.g. negative, or above 100).
 */
public class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}
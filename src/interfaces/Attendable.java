package interfaces;

/*
 * INTERFACE (Abstraction)
 * Any class whose attendance can be tracked implements this.
 */
public interface Attendable {
    void markAttendance(String date);
}
package interfaces;

/*
 * INTERFACE (Abstraction)
 * Any class that "can accept payments" implements this and
 * must define payFee(). Interface methods are public & abstract
 * by default.
 */
public interface Payable {
    void payFee(String studentName, double amount);
}
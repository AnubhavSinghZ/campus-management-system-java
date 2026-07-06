package services;

import entities.Student;
import interfaces.Payable;

import java.util.HashMap;

/*
 * SERVICE CLASS implementing the Payable interface.
 * Handles fee collection for students and keeps a running
 * total per student name (demonstrates HashMap usage too).
 */
public class FeeService implements Payable {

    private HashMap<String, Double> paymentRecords = new HashMap<>();

    // Implementing the interface method
    @Override
    public void payFee(String studentName, double amount) {
        double current = paymentRecords.getOrDefault(studentName, 0.0);
        paymentRecords.put(studentName, current + amount);
        System.out.println(studentName + " paid Rs." + amount
                + " (Total paid: Rs." + paymentRecords.get(studentName) + ")");
    }

    // Convenience overload that also updates the Student object itself
    public void payFee(Student student, double amount) {
        payFee(student.getName(), amount);
        student.addPayment(amount);
    }

    public double getTotalPaidBy(String studentName) {
        return paymentRecords.getOrDefault(studentName, 0.0);
    }
}
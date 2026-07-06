package services;

import exceptions.InvalidGradeException;

/*
 * SERVICE CLASS demonstrating COMPILE-TIME POLYMORPHISM
 * (Method Overloading). Same method name "calculate", but
 * different parameter lists - the compiler picks the right
 * version based on the arguments you pass.
 */
public class GradeCalculator {

    // Overload 1: marks already given as a direct percentage
    public double calculate(double marksObtained) {
        return marksObtained;
    }

    // Overload 2: marks obtained out of some total
    public double calculate(double marksObtained, double totalMarks) {
        return (marksObtained / totalMarks) * 100;
    }

    // Overload 3: average percentage across multiple subjects
    public double calculate(double[] subjectMarks, double totalPerSubject) {
        double sum = 0;
        for (double m : subjectMarks) {
            sum += m;
        }
        return (sum / (subjectMarks.length * totalPerSubject)) * 100;
    }

    // Converts percentage to a letter grade.
    // Throws a CUSTOM EXCEPTION for impossible percentages.
    public char getGrade(double percentage) throws InvalidGradeException {
        if (percentage < 0 || percentage > 100) {
            throw new InvalidGradeException("Percentage must be between 0 and 100. Got: " + percentage);
        }
        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 40) return 'D';
        else return 'F';
    }
}
package entities;

/*
 * INHERITANCE: Faculty extends Person
 * (You can extend this further, e.g. "HeadOfDepartment extends Faculty",
 * to demonstrate true multilevel inheritance.)
 */
public class Faculty extends Person {

    private String department;
    private double salary;

    public Faculty(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Salary: Rs." + salary;
    }
}
package entities;

/*
 * A simple class (Class & Object) representing a course.
 * Demonstrates basic encapsulation with a plain data class.
 */
public class Course {

    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course[" + courseId + " - " + courseName + ", Credits: " + credits + "]";
    }
}

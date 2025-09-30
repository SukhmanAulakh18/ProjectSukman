import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private String instructor;
    private List<StudentManager> enrolledStudents;
    
    public Course(String code, String name, int credits, String instructor) {
        this.courseCode = code;
        this.courseName = name;
        this.credits = credits;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }
    
    public void enrollStudent(StudentManager student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            System.out.println(student.getStudentName() + " enrolled in " + courseName);
        } else {
            System.out.println(student.getStudentName() + " is already enrolled in " + courseName);
        }
    }
    
    public void dropStudent(StudentManager student) {
        if (enrolledStudents.remove(student)) {
            System.out.println(student.getStudentName() + " dropped from " + courseName);
        } else {
            System.out.println(student.getStudentName() + " is not enrolled in " + courseName);
        }
    }
    
    public void displayCourseInfo() {
        System.out.println("\n=== Course Information ===");
        System.out.println("Course: " + courseCode + " - " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled Students: " + enrolledStudents.size());
        
        if (!enrolledStudents.isEmpty()) {
            System.out.println("\nStudent List:");
            for (StudentManager student : enrolledStudents) {
                System.out.println("- " + student.getStudentInfo());
            }
        }
    }
    
    // Getters
    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }
    public String getInstructor() { return instructor; }
    public List<StudentManager> getEnrolledStudents() { return enrolledStudents; }
}
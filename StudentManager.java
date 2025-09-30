public class StudentManager {
    private String studentName;
    private String studentId;
    private double gpa;
    
    public StudentManager(String name, String id, double gpa) {
        this.studentName = name;
        this.studentId = id;
        this.gpa = gpa;
    }
    
    public String getStudentInfo() {
        return String.format("Student: %s (ID: %s) - GPA: %.2f", 
                           studentName, studentId, gpa);
    }
    
    public void updateGPA(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            this.gpa = newGpa;
            System.out.println("GPA updated successfully!");
        } else {
            System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0");
        }
    }
    
    // Getters
    public String getStudentName() { return studentName; }
    public String getStudentId() { return studentId; }
    public double getGPA() { return gpa; }
}
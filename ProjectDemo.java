public class ProjectDemo {
    public static void main(String[] args) {
        System.out.println("=== Student Management System Demo ===");
        
        // Create students
        StudentManager student1 = new StudentManager("John Doe", "S12345", 3.75);
        StudentManager student2 = new StudentManager("Jane Smith", "S67890", 3.90);
        
        // Display student info
        System.out.println(student1.getStudentInfo());
        System.out.println(student2.getStudentInfo());
        
        // Update GPA
        System.out.println("\nUpdating GPA...");
        student1.updateGPA(3.85);
        System.out.println(student1.getStudentInfo());
        
        // Test invalid GPA
        System.out.println("\nTesting invalid GPA...");
        student1.updateGPA(5.0);
        
        // Course Management Demo
        System.out.println("\n=== Course Management Demo ===");
        
        // Create courses
        Course javaCourse = new Course("PROG24178", "Java Programming", 3, "Dr. Johnson");
        Course dbCourse = new Course("SYST25140", "Database Systems", 4, "Prof. Williams");
        
        // Enroll students
        javaCourse.enrollStudent(student1);
        javaCourse.enrollStudent(student2);
        dbCourse.enrollStudent(student1);
        
        // Display course info
        javaCourse.displayCourseInfo();
        dbCourse.displayCourseInfo();
        
        // Try to enroll same student again
        System.out.println("\n=== Testing Duplicate Enrollment ===");
        javaCourse.enrollStudent(student1);
        
        // Drop a student
        System.out.println("\n=== Testing Student Drop ===");
        javaCourse.dropStudent(student2);
        javaCourse.displayCourseInfo();
        
        System.out.println("\n=== Demo Complete ===");
    }
}
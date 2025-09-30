public class ProjectDemo {
    public static void main(String[] args) {
        System.out.println("=== Student Management System Demo ===");
        
        // Create a student
        StudentManager student1 = new StudentManager("John Doe", "S12345", 3.75);
        
        // Display student info
        System.out.println(student1.getStudentInfo());
        
        // Update GPA
        System.out.println("\nUpdating GPA...");
        student1.updateGPA(3.85);
        System.out.println(student1.getStudentInfo());
        
        // Test invalid GPA
        System.out.println("\nTesting invalid GPA...");
        student1.updateGPA(5.0);
        
        System.out.println("\n=== Demo Complete ===");
    }
}
import java.util.ArrayList;
import java.util.List;

public class GradeCalculator {
    private List<Double> grades;
    private List<String> courseNames;
    private List<Integer> credits;
    
    public GradeCalculator() {
        this.grades = new ArrayList<>();
        this.courseNames = new ArrayList<>();
        this.credits = new ArrayList<>();
    }
    
    public void addCourse(String courseName, double grade, int credit) {
        if (grade >= 0.0 && grade <= 4.0 && credit > 0) {
            courseNames.add(courseName);
            grades.add(grade);
            credits.add(credit);
            System.out.println("Added: " + courseName + " - Grade: " + grade + " - Credits: " + credit);
        } else {
            System.out.println("Invalid input! Grade must be 0.0-4.0 and credits must be positive.");
        }
    }
    
    public double calculateGPA() {
        if (grades.isEmpty()) {
            System.out.println("No courses added yet!");
            return 0.0;
        }
        
        double totalPoints = 0.0;
        int totalCredits = 0;
        
        for (int i = 0; i < grades.size(); i++) {
            totalPoints += grades.get(i) * credits.get(i);
            totalCredits += credits.get(i);
        }
        
        return totalCredits > 0 ? totalPoints / totalCredits : 0.0;
    }
    
    public void displayTranscript() {
        System.out.println("\n=== Student Transcript ===");
        if (grades.isEmpty()) {
            System.out.println("No courses completed.");
            return;
        }
        
        System.out.println("Course Name                 Grade    Credits");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.printf("%-25s   %.2f      %d%n", 
                            courseNames.get(i), grades.get(i), credits.get(i));
        }
        
        System.out.println("----------------------------------------");
        System.out.printf("Current GPA: %.2f%n", calculateGPA());
        System.out.printf("Total Credits: %d%n", getTotalCredits());
    }
    
    public String getLetterGrade(double gpa) {
        if (gpa >= 3.7) return "A";
        else if (gpa >= 3.3) return "A-";
        else if (gpa >= 3.0) return "B+";
        else if (gpa >= 2.7) return "B";
        else if (gpa >= 2.3) return "B-";
        else if (gpa >= 2.0) return "C+";
        else if (gpa >= 1.7) return "C";
        else if (gpa >= 1.3) return "C-";
        else if (gpa >= 1.0) return "D";
        else return "F";
    }
    
    public int getTotalCredits() {
        return credits.stream().mapToInt(Integer::intValue).sum();
    }
    
    public boolean isEligibleForDeansList() {
        return calculateGPA() >= 3.5 && getTotalCredits() >= 12;
    }
    
    // Getters
    public List<Double> getGrades() { return new ArrayList<>(grades); }
    public List<String> getCourseNames() { return new ArrayList<>(courseNames); }
    public List<Integer> getCredits() { return new ArrayList<>(credits); }
}
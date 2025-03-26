import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private ArrayList<Double> grades;
    
    /**
     * Constructor to initialize student with a name.
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    
    /**
     * Adds a grade to the student's list of grades.
     * @param grade The grade to be added.
     */
    public void addGrade(double grade) {
        grades.add(grade);
    }
    
    /**
     * Calculates and returns the average grade.
     * @return The average of the student's grades.
     */
    public double calculateAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    
    /**
     * Determines and returns the highest grade.
     * @return The highest grade from the list.
     */
    public double getHighestGrade() {
        return grades.stream().max(Double::compare).orElse(0.0);
    }
    
    /**
     * Determines and returns the lowest grade.
     * @return The lowest grade from the list.
     */
    public double getLowestGrade() {
        return grades.stream().min(Double::compare).orElse(0.0);
    }
    
    /**
     * Categorizes the student’s average grade into a letter grade.
     * @return The letter grade category.
     */
    public String getGradeCategory() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
    
    /**
     * Displays the student's details including grades, average, and category.
     */
    public void displayStudentReport() {
        System.out.println("\nStudent: " + name);
        System.out.println("Grades: " + grades);
        System.out.printf("Average Grade: %.2f\n", calculateAverage());
        System.out.println("Highest Grade: " + getHighestGrade());
        System.out.println("Lowest Grade: " + getLowestGrade());
        System.out.println("Grade Category: " + getGradeCategory());
    }
}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter student name (or type 'exit' to finish): ");
            String name = scanner.nextLine().trim();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            
            Student student = new Student(name);
            System.out.print("Enter the number of grades: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
            int numGrades = scanner.nextInt();
            scanner.nextLine(); 
            
            if (numGrades <= 0) {
                System.out.println("Invalid number of grades. Please enter a positive integer.");
                continue;
            }
            
            for (int i = 0; i < numGrades; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid grade. Please enter a numeric value between 0 and 100.");
                    scanner.next();
                }
                double grade = scanner.nextDouble();
                
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                    i--; 
                } else {
                    student.addGrade(grade);
                }
            }
            
            students.add(student);
            scanner.nextLine(); 
        }
        
        System.out.println("\nStudent Reports:");
        for (Student student : students) {
            student.displayStudentReport();
        }
        
        scanner.close();
    }
}

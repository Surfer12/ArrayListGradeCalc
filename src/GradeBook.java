
// GradeBook.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
    private List<Student> students;
    private Scanner scanner;
    private GradeCalculator gradeCalculator;

    public GradeBook() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
        gradeCalculator = new GradeCalculator();
    }

    public void run() {
        enterStudentNames();
        enterStudentGrades();
        calculateAverages();
        displayResults();
    }

    private void enterStudentNames() {
        System.out.print("Enter the number of students: ");
        int numStudents = getValidIntInput();

        for (int i = 0; i < numStudents; i++) {
            String name = InputReaders.getStudentName(scanner);
            students.add(new Student(name));
        }
    }

    private void enterStudentGrades() {
        for (Student student : students) {
            System.out.println("Entering grades for " + student.getName() + ":");
            InputReaders.readAssignmentScores(scanner, student);
        }
    }

    private int getValidIntInput() {
        while (true) {
            String input = scanner.nextLine();
            if (InputValidator.isValidScore(input)) {
                return Integer.parseInt(input);
            }
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    private void calculateAverages() {
        for (Student student : students) {
            double average = gradeCalculator.calculateAverage(student);
            student.setAverage(average);
        }
    }

    private void displayResults() {
        System.out.println("------------------------------");
        System.out.println("| Student | Grades | Avg |");
        System.out.println("------------------------------");

        for (Student student : students) {
            System.out.printf("| %-7s | %-20s | %.1f |\n",
                    student.getName(),
                    student.getGradesAsString(),
                    student.getAverage());
        }

        System.out.println("------------------------------");
        System.out.printf("Class Average: %.2f\n", calculateClassAverage());
    }

    private double calculateClassAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverage();
        }
        return sum / students.size();
    }
}
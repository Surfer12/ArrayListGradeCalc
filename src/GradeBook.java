// GradeBook.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
    private List<Student> students;
    private Scanner scanner;

    public GradeBook() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
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
            String name;
            do {
                System.out.print("Enter the name of student " + (i + 1) + ": ");
                name = scanner.nextLine();
            } while (!InputValidator.isValidName(name));
            students.add(new Student(name));
        }
    }

    private void enterStudentGrades() {
        for (Student student : students) {
            System.out.print("Enter the number of grades for " + student.getName() + ": ");
            int numGrades = getValidIntInput();

            for (int i = 0; i < numGrades; i++) {
                int grade;
                do {
                    System.out.print("Enter grade " + (i + 1) + ": ");
                    String input = scanner.nextLine();
                    grade = InputValidator.isValidScore(input) ? Integer.parseInt(input) : -1;
                } while (grade == -1);
                student.addGrade(grade);
            }
        }
    }

    private int getValidIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }


    private void calculateAverages() {
        for (Student student : students) {
            student.calculateAverage();
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

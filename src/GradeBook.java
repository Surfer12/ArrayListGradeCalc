
// GradeBook.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
    private static final String HEADER = "| Student | Grades | Avg |";
    private static final String SEPARATOR = "------------------------------";
    private static final String STUDENT_FORMAT = "| %-7s | %-20s | %.1f |";
    private static final String CLASS_AVERAGE_FORMAT = "Class Average: %.2f";
    private List<Student> students;
    private Scanner scanner;
    private GradeCalculator gradeCalculator;

    public GradeBook() {
        this.students = new ArrayList<>();
        scanner = new Scanner(System.in);
        gradeCalculator = new GradeCalculator();
    }

    public void run() {
        enterStudentNames();
        enterStudentGrades();
        calculateAverages();
        printGradeBook();
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

    /**
     * Prints the grade book details.
     */
    public void printGradeBook() {
        System.out.println(HEADER);
        System.out.println(SEPARATOR);

        for (Student student : students) {
            System.out.printf(STUDENT_FORMAT,
                    student.getName(),
                    student.getGradesAsString(),
                    student.getAverage());
            System.out.println();
        }

        System.out.println(SEPARATOR);
        System.out.printf(CLASS_AVERAGE_FORMAT, calculateClassAverage());
        System.out.println();
    }

    /**
     * Calculates the class average grade.
     *
     * @return the class average grade
     */
    private double calculateClassAverage() {
        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Student student : students) {
            sum += student.getAverage();
        }
        return sum / students.size();
    }

    /**
     * Adds a student to the grade book.
     *
     * @param student the student to add
     */
    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    /**
     * Removes a student from the grade book.
     *
     * @param student the student to remove
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }
}

}
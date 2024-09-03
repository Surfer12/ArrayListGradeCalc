import java.util.List;

public class DisplayResults {
    private final GradeBook gradeBook;

    public DisplayResults(GradeBook gradeBook) {
        this.gradeBook = gradeBook;
    }

    public void fullResultsDisplay() {
        System.out.println("------------------------------");
        System.out.println("| Student | Grades | Avg |");
        System.out.println("------------------------------");

        for (Student student : gradeBook.getStudents()) {
            System.out.print("| " + student.getName() + " | ");
            for (int j = 0; j < student.getGrades().size(); j++) {
                System.out.print(student.getGrades().get(j));
                if (j < student.getGrades().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" | " + student.calculateAverage() + " |");
        }

        System.out.println("------------------------------");
        System.out.println("Class Average: " + gradeBook.calculateClassAverage());
    }
}

/*2. Enter student grades: For each student, prompt the user to enter their grades (e.g., for multiple assignments or tests) and store them in another array.
 Use InputValidator.java */
public class GradeArray {

    public static void createStudentGradesArray() {
        ArrayList<Integer> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numStudents; i++) {
            Student student = new Student();
            InputReaders.readAssignmentScores(scanner, student);
            studentGrades.add(student.getTotalScore());
        }
        System.out.println("Student grades: " + studentGrades);
    }
}






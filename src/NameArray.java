import java.util.ArrayList;
import java.util.Scanner;

/*Enter student names: Prompt the user to enter the names of a certain number of students and store them in an array.
* Use InputReaders.java for student name retrieval and validation */
public class NameArray {

    public static void createStudentNamesArray() {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numStudents; i++) {
            String name = InputReaders.getStudentName(scanner);
            studentNames.add(name);
        }
        System.out.println("Student names: " + studentNames);
    }
}

public class PrintTable {
    // Print a neatly formatted table showing each student's name, their individual grades, and their average grade.
    public static void printTable(double[] average) {
        System.out.println("Student Name\t\tGrades\t\tAverage Grade");
        for (int i = 0; i < Student.getNumberOfStudents(); i++) {
        System.out.print(Student.getNames()[i] + "\t\t");
        for (int j = 0; j < Student.getNumberOfGrades(); j++) {
            System.out.print(Student.getGrades()[i][j] + " ");
        }
        System.out.println("\t\t" + average[i]);
    }
}

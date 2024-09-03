// src/PrintTable.java
public class PrintTable {
    public static void printTable(String[] studentNames, int[][] studentGrades, double[] studentAverages) {
        System.out.println("Student Name\t\tGrades\t\tAverage Grade");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print(studentNames[i] + "\t\t");
            for (int j = 0; j < studentGrades[i].length; j++) {
                System.out.print(studentGrades[i][j] + " ");
            }
            System.out.println("\t\t" + studentAverages[i]);
        }
    }
}
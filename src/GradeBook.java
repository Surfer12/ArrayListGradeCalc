// src/GradeBook.java

import java.util.Scanner;

public class GradeBook {
    private String[] studentNames;
    private int[][] studentGrades;
    private double[] studentAverages;
    private double classAverage;
    private Scanner scanner;

    public GradeBook() {
        scanner = new Scanner(System.in);
    }

    public void getStudentDetails() {
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        studentNames = new String[numStudents];
        studentGrades = new int[numStudents][];
        studentAverages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }
    }

    public void getGrades() {
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print("Enter the number of grades for " + studentNames[i] + ": ");
            int numGrades = Integer.parseInt(scanner.nextLine());
            studentGrades[i] = new int[numGrades];

            for (int j = 0; j < numGrades; j++) {
                System.out.print("Enter grade " + (j + 1) + ": ");
                studentGrades[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    public void calculateAverages() {
        for (int i = 0; i < studentGrades.length; i++) {
            int sum = 0;
            for (int j = 0; j < studentGrades[i].length; j++) {
                sum += studentGrades[i][j];
            }
            studentAverages[i] = (double) sum / studentGrades[i].length;
        }

        double sum = 0;
        for (int i = 0; i < studentAverages.length; i++) {
            sum += studentAverages[i];
        }
        classAverage = sum / studentAverages.length;
    }

    public void displayResults() {
        System.out.println("------------------------------");
        System.out.println("| Student | Grades | Avg |");
        System.out.println("------------------------------");

        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("| " + studentNames[i] + " | ");
            for (int j = 0; j < studentGrades[i].length; j++) {
                System.out.print(studentGrades[i][j]);
                if (j < studentGrades[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" | " + studentAverages[i] + " |");
        }

        System.out.println("------------------------------");
        System.out.println("Class Average: " + classAverage);
    }
}
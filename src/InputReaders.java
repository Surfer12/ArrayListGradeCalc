// src/InputReaders.java

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReaders {
    public static String getStudentName(Scanner scanner) {
        String input;
        try {
            do {
                System.out.print("Enter student's name: ");
                input = scanner.nextLine();
                if (!InputValidator.isValidName(input)) {
                    input = "";
                }
            } while (input.isEmpty());
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
            input = "";
        }
        return input;
    }

    public static void readAssignmentScores(Scanner scanner, Student student) {
        System.out.print("Enter assignment score (or type 'STOP' to finish inputting scores): ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("STOP")) {
                break;
            }
            if (InputValidator.isValidScore(input)) {
                student.addGrade(Integer.parseInt(input));
                System.out.println("Valid score entry recorded.");
                System.out.println("Total score: " + student.getTotalScore());
                System.out.println("Number of assignments: " + student.getNumAssignments());
            }
            System.out.print("Enter assignment score (or type 'STOP' to finish inputting scores): ");
        }
    }
}
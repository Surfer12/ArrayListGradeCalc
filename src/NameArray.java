// src/NameArray.java

import java.util.ArrayList;
import java.util.Scanner;

public class NameArray {
    String name = "";

    public static void createStudentNamesArray() {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numStudents; i++) {
            String name = InputReaders.getStudentName(scanner);
            if (name.equalsIgnoreCase("STOP")) {
                break;
            }
            studentNames.add(name);
        }
        System.out.println("Student names: " + studentNames);
    }
}
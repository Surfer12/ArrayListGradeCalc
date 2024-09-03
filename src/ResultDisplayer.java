// src/ResultDisplayer.java
public class ResultDisplayer {
    public void displayResults(String studentName, double average, char grade) {
        System.out.println("Student: " + studentName);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Final Grade: " + grade);
    }
}
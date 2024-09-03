// src/Main.java
public class Main {
    public static void main(String[] args) {
        GradeBook gradebook = new GradeBook();
        gradebook.getStudentDetails();
        gradebook.getGrades();
        gradebook.calculateAverages();
        gradebook.displayResults();
    }
}


/*Task: Gradebook Calculator
Objective: Create a Java program that simulates a simple gradebook using arrays. The program should allow the user to:
1. Enter student names: Prompt the user to enter the names of a certain number of students and store them in an array.
2. Enter student grades: For each student, prompt the user to enter their grades (e.g., for multiple assignments or tests) and store them in another array.
3. Calculate averages: Calculate the average grade for each student and store the averages in a third array.
4. Display results: Print a neatly formatted table showing each student's name, their individual grades, and their average grade.
5. Bonus: Calculate and display the class average.
   Tips:
   • Use Scanner to get user input.
   • Use loops to iterate through the arrays for input, calculations, and output.
   • Consider using methods to break down the program into smaller, more manageable parts (e.g., a method to get student names, a method to get grades, a method to calculate averages).
   • Use appropriate formatting to make the output clear and easy to read.
   Challenge:
   • Implement error handling to gracefully handle invalid inputs (e.g., non-numeric grades).
   NB: remember to create a class diagram, and to have a separate class for the main method
   Example output
   Enter the number of students: 3
   Enter the name of student 1: Alice
   Enter the number of grades for Alice: 3
   Enter grade 1: 85
   Enter grade 2: 92
   Enter grade 3: 78
   Enter the name of student 2: Bob
   Enter the number of grades for Bob: 4
   Enter grade 1: 90
   Enter grade 2: 88
   Enter grade 3: 95
   Enter grade 4: 75
   Enter the name of student 3: Charlie
   Enter the number of grades for Charlie: 2
   Enter grade 1: 70
   Enter grade 2: 82
------------------------------
| Student | Grades | Avg |
------------------------------
| Alice | 85, 92, 78| 85.0 |
| Bob | 90, 88, 95, 75| 87.0 |
| Charlie | 70, 82 | 76.0 |
------------------------------
Class Average: 82.67
Task 2
• What if we don't know the number of students in advance?
• How can we modify our program to handle a dynamic number of students?*/// src/Main.java
public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        gradeBook.getStudentNames();
        gradeBook.getStudentGrades();
        gradeBook.calculateAverages();
        gradeBook.displayResults();
    }
}
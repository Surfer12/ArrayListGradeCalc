/*Calculate averages: Calculate the average grade for each student and store the averages in a third array.
4. Display results: Print a neatly formatted table showing each student's name, their individual grades, and their average grade.
5. Bonus: Calculate and display the class average.*/

public class CalculateAverage {
    public static void calculateAverage(){
        // Calculate the average grade for each student and store the averages in a third array.
        double[] average = new double[Student.getNumberOfStudents()];
        for (int i = 0; i < Student.getNumberOfStudents(); i++) {
            double sum = 0;
            for (int j = 0; j < Student.getNumberOfGrades(); j++) {
                sum += Student.getGrades()[i][j];
            }
            average[i] = sum / Student.getNumberOfGrades();
        }
    }
}

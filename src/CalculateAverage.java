/*Calculate averages: Calculate the average grade for each student and store the averages in a third array.
4. Display results: Print a neatly formatted table showing each student's name, their individual grades, and their average grade.
5. Bonus: Calculate and display the class average.*/

public class CalculateAverage {
    public static void calculateAverage() {
        // Calculate the average grade for each student and store the averages in a third array.
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
}

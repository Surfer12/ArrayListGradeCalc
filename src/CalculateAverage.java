public class CalculateAverage {
    public static void calculateAverage() {
        // Create a two-dimensional array to store the grades for each student.
        int[][] studentGrades = new int[3][3]; // Placeholder initialization
        double[] studentAverages = new double[studentGrades.length];
        double classAverage = 0.0;

        // Calculate the average grade for each student and store the averages in a third array.
        for (int i = 0; i < studentGrades.length; i++) {
            int sum = 0;
            for (int j = 0; j < studentGrades[i].length; j++) {
                sum += studentGrades[i][j];
            }
            studentAverages[i] = (double) sum / studentGrades[i].length;
        }
    }
}
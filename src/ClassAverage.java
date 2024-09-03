// src/ClassAverage.java
public class ClassAverage {
    public static void calculateClassAverage(double[] averages) {
        double sum = 0;
        for (double average : averages) {
            sum += average;
        }
        double classAverage = sum / averages.length;
        System.out.println("Class Average: " + classAverage);
    }
}
public class ClassAverage {
    public static void calculateClassAverage(double[] average) {
        double sum = 0;
        for (int i = 0; i < Student.getNumberOfStudents(); i++) {
            sum += average[i];
        }
        double classAverage = sum / Student.getNumberOfStudents();
        System.out.println("Class Average: " + classAverage);
    }
}

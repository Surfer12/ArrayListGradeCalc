// GradeBookUtils.java
import java.util.List;

public class GradeBookUtils {
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static String formatGrades(List<Integer> grades) {
        return String.join(", ", grades.stream().map(String::valueOf).toList());
    }
}

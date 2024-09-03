import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private String gradeLevel;
    private String studentID;
    private String[] courses;
    private double totalUnits;
    private double completedUnits;
    private double GPA;
    private int totalScore;
    private int numAssignments;
    private double average;
    private ArrayList<Integer> scores;
    private final ArrayList<String> studentNames = new ArrayList<>();
    private final ArrayList<ArrayList<Double>> studentGrades = new ArrayList<>();
    private final ArrayList<Double> studentAverages = new ArrayList<>();
    private static Student[] students;
    private ArrayList<Integer> grades;

    public Student(String name, int phoneNumber, String gender, int Age, String dateOfBirth, boolean isBirthday, String grade,
                   String studentID, String[] courses, double totalUnits, double completedUnits,
                   double GPA, int totalScore, int numAssignments, double average, ArrayList<Integer> scores, ArrayList<Integer> grades) {
        super(name, phoneNumber, gender, Age, dateOfBirth, false);
        this.gradeLevel = grade;
        this.studentID = studentID;
        this.courses = courses;
        this.totalUnits = totalUnits;
        this.completedUnits = completedUnits;
        this.GPA = GPA;
        this.totalScore = 0;
        this.numAssignments = 0;
        this.average = average;
        this.scores = scores;
        this.grades = grades;
    }

    public Student(String name, double average) {
        this.name = name;
        this.average = average;
    }

    public void showStudentDetails() {
        super.showPersonDetails();
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Student ID: " + studentID);
        System.out.println("Courses listed below: ");
        for (String course : courses) {
            System.out.println(course);
        }
        System.out.println("Total Units: " + totalUnits);
        System.out.println("Completed Units: " + completedUnits);
        System.out.println("GPA: " + GPA);
    }

    public void addAssignmentScore(int score) {
        this.totalScore += score;
        this.numAssignments++;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getNumAssignments() {
        return numAssignments;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void fullResultsDisplay() {
        System.out.println("------------------------------");
        System.out.println("| Student | Grades | Avg |");
        System.out.println("------------------------------");

        for (Student student : Student.getStudents()) {
            System.out.print("| " + student.getName() + " | ");
            for (int j = 0; j < student.getScores().size(); j++) {
                System.out.print(student.getScores().get(j));
                if (j < student.getScores().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" | " + student.getAverage() + " |");
        }

        System.out.println("------------------------------");
        System.out.println("Class Average: " + calculateClassAverage());
    }

    public static Student[] getStudents() {
        return students;
    }

    public void getStudentNames() {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter the name of the student (or type 'done' to finish): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            studentNames.add(input);
            studentGrades.add(new ArrayList<>());
        }
    }

    public void getStudentGrades() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.print("Enter the number of grades for " + studentNames.get(i) + ": ");
            int numGrades = scanner.nextInt();

            for (int j = 0; j < numGrades; j++) {
                System.out.print("Enter grade " + (j + 1) + ": ");
                studentGrades.get(i).add(scanner.nextDouble());
            }
        }
    }

    public void calculateAverages() {
        for (ArrayList<Double> grades : studentGrades) {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            studentAverages.add(sum / grades.size());
        }
    }

    public void displayResults() {
        System.out.println("------------------------------");
        System.out.println("| Student | Grades | Avg |");
        System.out.println("------------------------------");

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.print("| " + studentNames.get(i) + " | ");
            for (int j = 0; j < studentGrades.get(i).size(); j++) {
                System.out.print(studentGrades.get(i).get(j));
                if (j < studentGrades.get(i).size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" | " + studentAverages.get(i) + " |");
        }

        System.out.println("------------------------------");
        System.out.println("Class Average: " + calculateClassAverage());
    }

    public double calculateClassAverage() {
        double totalSum = 0;
        for (double avg : studentAverages) {
            totalSum += avg;
        }
        return totalSum / studentAverages.size();
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }


}
public class Student extends Person {
    private String gradeLevel;
    private String studentID;
    private String[] courses;
    private double totalUnits;
    private double completedUnits;
    private double GPA;
    private int totalScore;
    private int numAssignments;


    public Student(String name, int phoneNumber, String gender, int Age, String dateOfBirth, boolean isBirthday, String grade,
                   String studentID, String[] courses, double totalUnits, double completedUnits,
                   double GPA, int totalScore, int numAssignments) {
        super(name, phoneNumber, gender, Age, dateOfBirth, false);
        this.gradeLevel = grade;
        this.studentID = studentID;
        this.courses = courses;
        this.totalUnits = totalUnits;
        this.completedUnits = completedUnits;
        this.GPA = GPA;
        this.totalScore = 0;
        this.numAssignments = 0;
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

    public String getName() {
        return name;
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
}


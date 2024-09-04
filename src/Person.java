public class Person {
    protected String name;
    protected int phoneNumber;
    protected String gender;
    protected int age;
    protected String dateOfBirth;
    protected boolean isBirthday;

    public Person() {
        this.name = "John Doe";
        this.phoneNumber = 123456789;
        this.gender = "MALE";
        this.age = 18;
        this.dateOfBirth = "01/01/2001";
        this.isBirthday = false;
    }

    public Person(String name, int phoneNumber, String gender, int age, String dateOfBirth, boolean isBirthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.isBirthday = isBirthday;
    }

    public void showPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
        if (isBirthday) {
            handleBirthday();
        } else {
            handleNotBirthday();
        }
    }

    public void handleBirthday() {
        System.out.println("Happy Birthday!" + "\n");
    }

    public void handleNotBirthday() {
        System.out.println("Today is not their birthday");
    }
}
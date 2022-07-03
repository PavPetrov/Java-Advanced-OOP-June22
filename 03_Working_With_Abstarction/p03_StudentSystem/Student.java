package p03_Working_With_Abstarction.p03_StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getInfo() {
        String getInfo = String.format("%s is %s years old.", name, age);

        if (grade >= 5.00) {
            getInfo += " Excellent student.";
        } else if (grade < 5.00 && grade >= 3.50) {
            getInfo += " Average student.";
        } else {
            getInfo += " Very nice person.";
        }
        return getInfo;
    }
}

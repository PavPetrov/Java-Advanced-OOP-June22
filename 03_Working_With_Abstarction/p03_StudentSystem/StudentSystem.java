package p03_Working_With_Abstarction.p03_StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }


    public void ParseCommand(String[] args) {
        String name = args[1];
        String command = args[0];
        if (command.equals("Create")) {

            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);

            if (!students.containsKey(name)) {
                Student student = new Student(name, age, grade);
                students.put(name, student);
            }

        } else if (command.equals("Show")) {
            Student student = students.get(name);

            if (student !=null) {
                System.out.println(student.getInfo());
            }
        }
    }
}

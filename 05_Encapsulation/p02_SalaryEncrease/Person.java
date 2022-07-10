package p05_Encapsulation.p02_SalaryEncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + this.getSalary() * (bonus / 100) / 2);
        } else {
            this.setSalary(this.getSalary() + this.getSalary() * (bonus / 100));
        }
    }

    @Override
    public String toString() {
        //Angel Ivanov gets 2640.0 leva
        return String.format("%s %s gets %f leva",this.getFirstName(), this.getLastName(), this.getSalary());
    }
}

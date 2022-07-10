package p05_Encapsulation.p03_ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void setFirstName(String firstName) {
        nameValidate(firstName, "First name");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        nameValidate(lastName, "Last name");
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if ( age < 1){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 460){
            throw  new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + this.getSalary() * (bonus / 100) / 2);
        } else {
            this.setSalary(this.getSalary() + this.getSalary() * (bonus / 100));
        }
    }

    private void nameValidate(String firstName, String nameType) {
        if (firstName.length() < 3) {
            String exceptionMessage = nameType + " cannot be less than 3 symbols";
            throw new IllegalArgumentException(exceptionMessage);
        }
    }

    @Override
    public String toString() {
        //Angel Ivanov gets 2640.0 leva
        return String.format("%s %s gets %f leva", this.getFirstName(), this.getLastName(), this.getSalary());
    }
}

package p06_ExercisesEncapsulation.p02_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");

        }
        this.age = age;
    }

    private void setName(String name) {
        if (name == null && name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (age < 6) {
            return 2;
        } else if (age < 12){
            return 1;
        }
        return 0.75;
    }
//Chicken Chichi (age 10) can produce 1.00 eggs per day.
    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                this.name, this.age, productPerDay());
    }
}

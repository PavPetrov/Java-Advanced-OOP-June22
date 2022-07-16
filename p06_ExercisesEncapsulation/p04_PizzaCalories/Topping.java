package p06_ExercisesEncapsulation.p04_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies")
                || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else throw new IllegalArgumentException("Cannot place " + toppingType
                + " on top of your pizza.");
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
    }

    public double calculateCalories() {
        return 2 * weight * ToppingModifiers.valueOf(toppingType).getToppingModifier();
    }
}

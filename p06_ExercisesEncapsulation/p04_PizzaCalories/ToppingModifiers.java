package p06_ExercisesEncapsulation.p04_PizzaCalories;

public enum ToppingModifiers {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    double toppingModifier;

    ToppingModifiers(double toppingModifier) {
        this.toppingModifier = toppingModifier;
    }

    public double getToppingModifier() {
        return toppingModifier;
    }
}

package p06_ExercisesEncapsulation.p04_PizzaCalories;

public enum DoughModifiers {
    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1);

    double doughModifier;

    DoughModifiers(double doughModifier) {
        this.doughModifier = doughModifier;
    }

    public double getDoughModifier() {
        return doughModifier;
    }

}

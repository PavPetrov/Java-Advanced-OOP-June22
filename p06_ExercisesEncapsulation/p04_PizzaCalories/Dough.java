package p06_ExercisesEncapsulation.p04_PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight > 0 && weight <= 200) {
            this.weight = weight;
        } else throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else throw new IllegalArgumentException("Invalid type of dough.");
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else throw new IllegalArgumentException("Invalid type of dough.");

    }

    public double calculateCalories() {
        double doughModifier = DoughModifiers.valueOf(flourType).getDoughModifier();
        double bakingTechniqueModifier = DoughModifiers.valueOf(bakingTechnique).getDoughModifier();

        return 2 * weight * doughModifier * bakingTechniqueModifier;
    }


}

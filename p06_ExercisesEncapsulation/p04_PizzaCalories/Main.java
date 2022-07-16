package p06_ExercisesEncapsulation.p04_PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split(" ");
        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);

        String[] doughData = scanner.nextLine().split(" ");
        String flourType = doughData[1];
        String bakingTechnique = doughData[2];
        double weight = Double.parseDouble(doughData[3]);
        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(flourType, bakingTechnique, weight);
            pizza.setDough(dough);

            String toppingInput = scanner.nextLine();
            while (!"END".equals(toppingInput)) {
                String[] toppingData = toppingInput.split(" ");
                String toppingType = toppingData[1];
                double toppingWeight = Double.parseDouble(toppingData[2]);

                Topping topping = new Topping(toppingType, toppingWeight);

                pizza.addTopping(topping);



                toppingInput = scanner.nextLine();
            }
            System.out.printf("%s - %.2f", pizzaName, pizza.getOverallCalories());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }



        System.out.println();

    }
}

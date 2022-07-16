package p06_ExercisesEncapsulation.p03_ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] personInput = scanner.nextLine().split(";");
        String[] productInput = scanner.nextLine().split(";");

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();

        for (String s : personInput) {
            String[] personData = s.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name, money);
                personMap.put(name, person);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        for (String p : productInput) {
            String[] productData = p.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, cost);
                productMap.put(name, product);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] data = command.split(" ");
            String personName = data[0];
            String productName = data[1];

            Person buyer = personMap.get(personName);
            Product productToBuy = productMap.get(productName);

            try {
                buyer.buyProduct(productToBuy);
                System.out.printf("%s bought %s%n", personName, productName);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        personMap.values().forEach(System.out::println);
    }

}


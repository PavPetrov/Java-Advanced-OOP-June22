package p08_Inheritance.p06_Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalInput = scanner.nextLine();

        while (!"Beast!".equals(animalInput)) {
            String[] animalData = scanner.nextLine().split(" ");

            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];
            try {
                switch (animalInput) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        break;
                    case "Kittens":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animalInput = scanner.nextLine();
        }

    }
}

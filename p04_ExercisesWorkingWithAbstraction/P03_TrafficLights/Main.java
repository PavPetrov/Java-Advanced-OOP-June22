package p04_ExercisesWorkingWithAbstraction.P03_TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> colors = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<TrafficLights> trafficLights = new ArrayList<>();

        for (String color : colors) {
            TrafficLights trafficLight = new TrafficLights(Color.valueOf(color));
            trafficLights.add(trafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            for (TrafficLights trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }

            System.out.println();
        }
    }
}

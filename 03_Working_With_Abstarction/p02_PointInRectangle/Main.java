package p03_Working_With_Abstarction.p02_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectCoordinates = getCoordinates(scanner);
        Point A = new Point(rectCoordinates[0], rectCoordinates[1]);
        Point C = new Point(rectCoordinates[2], rectCoordinates[3]);

        Rectangle rectangle = new Rectangle(A, C);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- >0){
            int[] pointCoordinates = getCoordinates(scanner);
            Point point = new Point(pointCoordinates[0], pointCoordinates[1] );
            System.out.println(rectangle.contains(point));
        }
    }

    private static int[] getCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}

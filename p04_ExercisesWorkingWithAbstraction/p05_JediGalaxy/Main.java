package p04_ExercisesWorkingWithAbstraction.p05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Field.parseDimensions(scanner.nextLine());
        int row = dimensions[0];
        int col = dimensions[1];


        String command = scanner.nextLine();
        long starCollected = 0;
        Field field = new Field(row, col);

        while (!command.equals("Let the Force be with you")) {

            int[] jediPosition = Field.parseDimensions(command);
            int[] evilPosition = Field.parseDimensions(scanner.nextLine());

            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];

            Evil.moveEvil(evilRow,evilCol,field);

            int jediRow = jediPosition[0];
            int jediCol = jediPosition[1];

            starCollected += Jedi.moveJedi(jediRow, jediCol, field);

            command = scanner.nextLine();
        }
        System.out.println(starCollected);
    }
}
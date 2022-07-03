package p03_Working_With_Abstarction.p01_RhombusOFStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        printRhombus(size);
    }

    private static void printRhombus(int size) {
        int rows = size * 2;
        for (int row = 0; row < rows; row++) {
            printRow(size, row);
        }

    }

    private static void printRow(int size, int row) {
        if (row < size) {
            for (int i = 1; i < size - row; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("* ");
            }
        } else {
            for (int i = 0; i <= row - size; i++) {
                System.out.print(" ");
            }
            for (int i = row - size; i < size - 1; i++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
}

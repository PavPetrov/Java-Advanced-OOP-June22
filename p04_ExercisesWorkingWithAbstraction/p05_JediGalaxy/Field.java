package p04_ExercisesWorkingWithAbstraction.p05_JediGalaxy;

import java.util.Arrays;

public class Field {

    private int[][] starField;

    public Field(int row, int col) {
        starField = new int[row][col];
        this.fillField(row, col);
    }

    private void fillField(int row, int col) {
        int value = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                starField[i][j] = value++;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.starField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        this.starField[row][col] = newValue;
    }

    public int getRowLength() {
        return starField.length;
    }

    public int getColLength() {
        return starField[0].length;
    }

    static int[] parseDimensions(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}

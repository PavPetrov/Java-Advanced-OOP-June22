package p04_ExercisesWorkingWithAbstraction.p05_JediGalaxy;

public class Evil {
    public static void moveEvil(int evilRow, int evilCol, Field starField){
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < starField.getRowLength() && evilCol < starField.getColLength()) {
                starField.setValue(evilRow, evilCol, 0);
            }
            evilRow--;
            evilCol--;
        }
    }


}

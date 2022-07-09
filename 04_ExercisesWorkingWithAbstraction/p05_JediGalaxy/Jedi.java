package p04_ExercisesWorkingWithAbstraction.p05_JediGalaxy;

public class Jedi {

    public static int moveJedi(int jediRow, int jediCol, Field starField){
        int starCollected = 0;
        while (jediRow >= 0 && jediCol < starField.getColLength()) {
            if (jediRow < starField.getRowLength() && jediCol >= 0 && jediCol < starField.getColLength()) {
                starCollected += starField.getValue(jediRow, jediCol);
            }

            jediCol++;
            jediRow--;
        }
        return starCollected;
    }

}

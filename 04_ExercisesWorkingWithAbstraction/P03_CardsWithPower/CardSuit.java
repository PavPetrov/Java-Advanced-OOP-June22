package p04_ExercisesWorkingWithAbstraction.P03_CardsWithPower;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    int power;

    CardSuit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}

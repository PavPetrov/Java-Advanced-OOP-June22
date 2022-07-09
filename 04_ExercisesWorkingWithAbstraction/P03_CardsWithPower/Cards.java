package p04_ExercisesWorkingWithAbstraction.P03_CardsWithPower;

public class Cards {
    private CardRank cardRank;
    private CardSuit cardSuit;

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public Cards(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int getPower() {
        return cardRank.getPower() + cardSuit.getPower();
    }
}

package p04_ExercisesWorkingWithAbstraction.P03_CardsWithPower;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());

        Cards card = new Cards(cardRank,cardSuit);

        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardRank(), card.getCardSuit()
                ,card.getPower());
    }
}

package p03_Working_With_Abstarction.p04_Hotel_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] reservationInfo = scanner.nextLine().split(" ");

        double pricePerDay = Double.parseDouble(reservationInfo[0]);
        int days = Integer.parseInt(reservationInfo[1]);
        String seasonName = reservationInfo[2];
        String discountType = reservationInfo[3];

        Season season = Season.parse(seasonName);
        DiscountType discount = DiscountType.parse(discountType);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, days, season,discount);

        System.out.printf("%.2f", priceCalculator.calculatePrice());

    }
}

package p03_Working_With_Abstarction.p04_Hotel_Reservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discount;

    public PriceCalculator(double pricePerDay, int days, Season season, DiscountType discount) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public double calculatePrice() {
        return days * pricePerDay * season.getMultiplier() * discount.getDiscount();
    }
}


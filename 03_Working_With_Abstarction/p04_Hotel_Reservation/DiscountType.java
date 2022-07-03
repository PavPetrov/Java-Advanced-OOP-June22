package p03_Working_With_Abstarction.p04_Hotel_Reservation;

public enum DiscountType {
    VIP(0.8),
    SECOND_VISIT(0.9),
    NONE(1);

    private double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public static DiscountType parse(String s) {
        switch (s) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException();
        }
    }

    public double getDiscount() {
        return discount;
    }
}

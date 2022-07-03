package p03_Working_With_Abstarction.p04_Hotel_Reservation;

import java.util.Locale;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplier;

    Season (int multiplier){
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public static Season parse(String s){
        return Season.valueOf(s.toUpperCase(Locale.ROOT));

    }
}

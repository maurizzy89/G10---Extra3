package utility;

import entity.Hotel;
import java.util.Comparator;

public class Comparators {

    public static Comparator<Hotel> orderForMajorPrice = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getRoomPrice().compareTo(t.getRoomPrice());
        }
    };
}
package service;

import entity.NonHotelAccommodation;
import java.util.Scanner;

public class NonHotelAccommodationService {

    protected Scanner read = new Scanner(System.in);

    public NonHotelAccommodation create() {
        NonHotelAccommodation alojamientoExtraHotelero = new NonHotelAccommodation();

        alojamientoExtraHotelero.setAmountM2(read.nextDouble());
        alojamientoExtraHotelero.setPriv4te(read.nextBoolean());

        return alojamientoExtraHotelero;
    }
}

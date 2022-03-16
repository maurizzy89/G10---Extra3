package service;

import entity.Camping;

public final class CampingService extends NonHotelAccommodationService {

    public Camping create() {
        super.create();
        Camping camping = new Camping();
        camping.setMaxCapacityTent(read.nextDouble());
        camping.setAmountBathroomsAvailables(read.nextDouble());
        camping.setRestaurant(read.nextBoolean());

        return camping;
    }
}

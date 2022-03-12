package service;

import entity.Camping;

public final class CampingService extends NonHotelAccommodationService {

    @Override
    public Camping create() {
        Camping camping = new Camping();
        camping.setMaxCapacityTent(read.nextDouble());
        camping.setAmountBathroomsAvailables(read.nextDouble());
        camping.setRestaurant(read.nextBoolean());

        return camping;
    }
}

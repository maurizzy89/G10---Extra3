package service;

import entity.Hotel;

public class HotelService extends AccommodationService {

    @Override
    public Hotel create() {
        Hotel hotel = new Hotel();

        hotel.setNumberOfRooms(read.nextDouble());
        hotel.setNumberOfBeds(read.nextDouble());
        hotel.setNunmberOfFlats(read.nextDouble());
        hotel.setRoomPrice(read.nextInt());

        return hotel;
    }

    public double roomPrice(Hotel4StarsService hotel4EstrellasService, Hotel5StarsService hotel5EstrellasService) {
        double roomPrice = 50 + (1 * (100)) + (hotel4EstrellasService.calculateValueAddedRestaurant()) + (hotel4EstrellasService.calculateValueAddedGym()) + (hotel5EstrellasService.calculateValueAddedLimousine());

        return roomPrice;
    }
}

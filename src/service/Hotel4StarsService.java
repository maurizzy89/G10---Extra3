package service;

import entity.Hotel4Stars;

public class Hotel4StarsService extends HotelService {

    protected Hotel4Stars hotel4Estrellas = new Hotel4Stars();

    public Hotel4Stars create() {
        super.create();
        hotel4Estrellas.setGym(read.nextBoolean());
        hotel4Estrellas.setRestaurantName(read.next());
        hotel4Estrellas.setRestaurantCapacity(read.nextDouble());

        return hotel4Estrellas;
    }

    public double calculateValueAddedRestaurant() {
        double valueAdded = 0;

        if (hotel4Estrellas.getRestaurantCapacity() < 30) {
            valueAdded = 10;
        }
        if (hotel4Estrellas.getRestaurantCapacity() >= 30 && hotel4Estrellas.getRestaurantCapacity() < 50) {
            valueAdded = 30;
        }
        if (hotel4Estrellas.getRestaurantCapacity() >= 50) {
            valueAdded = 50;
        }

        return valueAdded;
    }

    public double calculateValueAddedGym() {
        double valueAdded = 0;

        if (hotel4Estrellas.isGym()) {
            valueAdded = 50;
        } else {
            valueAdded = 30;
        }

        return valueAdded;
    }

}

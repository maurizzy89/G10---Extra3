package service;

import entity.Hotel5Stars;

public class Hotel5StarsService extends Hotel4StarsService {

    private Hotel5Stars hotel5Estrellas = new Hotel5Stars();

    public Hotel5Stars create() {
        super.create();
        hotel5Estrellas.setNumberOfConferenceSalons(read.nextDouble());
        hotel5Estrellas.setNumberOfLimousines(read.nextDouble());
        hotel5Estrellas.setNumberOfSuites(read.nextDouble());

        return hotel5Estrellas;
    }

    public double calculateValueAddedLimousine() {
        double valueAdded = hotel5Estrellas.getNumberOfLimousines() * 15;

        return valueAdded;
    }
}

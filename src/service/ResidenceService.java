package service;

import entity.Residence;

public final class ResidenceService extends NonHotelAccommodationService {

    public Residence create() {
        super.create();
        Residence residencia = new Residence();

        residencia.setNumberOfRooms(read.nextDouble());
        residencia.setSportFields(read.nextBoolean());
        residencia.setGuildsDiscount(read.nextBoolean());

        return residencia;
    }

}

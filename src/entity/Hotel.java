package entity;

public class Hotel extends Accommodation {

    protected double numberOfRooms;
    protected double numberOfBeds;
    protected double nunmberOfFlats;
    protected Integer roomPrice;

    public Hotel() {
    }

    public Hotel(double numberOfRooms, double numberOfBeds, double nunmberOfFlats, Integer roomPrice, String name, String adress, String locality, String inChargeMan) {
        super(name, adress, locality, inChargeMan);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBeds = numberOfBeds;
        this.nunmberOfFlats = nunmberOfFlats;
        this.roomPrice = roomPrice;
    }

    public double getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(double numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(double numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getNunmberOfFlats() {
        return nunmberOfFlats;
    }

    public void setNunmberOfFlats(double nunmberOfFlats) {
        this.nunmberOfFlats = nunmberOfFlats;
    }

    public Integer getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Integer roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "numberOfRooms=" + numberOfRooms + ", numberOfBeds=" + numberOfBeds + ", nunmberOfFlats=" + nunmberOfFlats + ", roomPrice=" + roomPrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.roomPrice) ^ (Double.doubleToLongBits(this.roomPrice) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        return true;
    }

}

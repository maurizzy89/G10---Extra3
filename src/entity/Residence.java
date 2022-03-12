package entity;

public final class Residence extends NonHotelAccommodation {

    private double numberOfRooms;
    private boolean guildsDiscount;
    private boolean sportFields;

    public Residence() {
    }
    
    public Residence(double numberOfRooms, boolean guildsDiscount, boolean sportFields, boolean priv4te, double amountM2, String name, String adress, String locality, String inChargeMan) {
        super(priv4te, amountM2, name, adress, locality, inChargeMan);
        this.numberOfRooms = numberOfRooms;
        this.guildsDiscount = guildsDiscount;
        this.sportFields = sportFields;
    }

    public double getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(double numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean isGuildsDiscount() {
        return guildsDiscount;
    }

    public void setGuildsDiscount(boolean guildsDiscount) {
        this.guildsDiscount = guildsDiscount;
    }

    public boolean isSportFields() {
        return sportFields;
    }

    public void setSportFields(boolean sportFields) {
        this.sportFields = sportFields;
    }

    @Override
    public String toString() {
        return super.toString() + "\nResidences{" + "numberOfRooms=" + numberOfRooms + ", guildsDiscount=" + guildsDiscount + ", sportFields=" + sportFields + '}';
    }

}

package entity;

public final class Camping extends NonHotelAccommodation {

    private double maxCapacityTent;
    private double amountBathroomsAvailables;
    private boolean restaurant;

    public Camping() {
    }
    
    public Camping(double maxCapacityTent, double amountBathroomsAvailables, boolean restaurant, boolean priv4te, double amountM2, String name, String adress, String locality, String inChargeMan) {
        super(priv4te, amountM2, name, adress, locality, inChargeMan);
        this.maxCapacityTent = maxCapacityTent;
        this.amountBathroomsAvailables = amountBathroomsAvailables;
        this.restaurant = restaurant;
    }

    public double getMaxCapacityTent() {
        return maxCapacityTent;
    }

    public void setMaxCapacityTent(double maxCapacityTent) {
        this.maxCapacityTent = maxCapacityTent;
    }

    public double getAmountBathroomsAvailables() {
        return amountBathroomsAvailables;
    }

    public void setAmountBathroomsAvailables(double amountBathroomsAvailables) {
        this.amountBathroomsAvailables = amountBathroomsAvailables;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCamping{" + "maxCapacityTent=" + maxCapacityTent + ", amountBathroomsAvailables=" + amountBathroomsAvailables + ", restaurant=" + restaurant + '}';
    }

}

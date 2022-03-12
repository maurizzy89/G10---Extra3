package entity;

public class Hotel4Stars extends Hotel {

    protected boolean gym;
    protected String restaurantName;
    protected double restaurantCapacity;

    public Hotel4Stars() {
    }

    public Hotel4Stars(boolean gym, String restaurantName, double restaurantCapacity,double numberOfRooms, double numberOfBeds, double nunmberOfFlats, Integer roomPrice, String name, String adress, String locality, String inChargeMan) {
        super(numberOfRooms, numberOfBeds, nunmberOfFlats, roomPrice, name, adress, locality, inChargeMan);
        this.gym = gym;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public void setRestaurantCapacity(double restaurantCapacity) {
        this.restaurantCapacity = restaurantCapacity;
    }

    @Override
    public String toString() {
        return super.toString()  + "\n" + "gym=" + gym + ", restaurantName=" + restaurantName + ", restaurantCapacity=" + restaurantCapacity;
    }



}

package entity;

public final class Hotel5Stars extends Hotel4Stars {

    private double numberOfConferenceSalons;
    private double numberOfSuites;
    private double numberOfLimousines;

    public Hotel5Stars() {
    }

    public Hotel5Stars(double numberOfConferenceSalons, double numberOfSuites, double numberOfLimousines, boolean gym, String restaurantName, double restaurantCapacity, double numberOfRooms, double numberOfBeds, double nunmberOfFlats, Integer roomPrice, String name, String adress, String locality, String inChargeMan) {
        super(gym, restaurantName, restaurantCapacity, numberOfRooms, numberOfBeds, nunmberOfFlats, roomPrice, name, adress, locality, inChargeMan);
        this.numberOfConferenceSalons = numberOfConferenceSalons;
        this.numberOfSuites = numberOfSuites;
        this.numberOfLimousines = numberOfLimousines;
    }

    public double getNumberOfConferenceSalons() {
        return numberOfConferenceSalons;
    }

    public void setNumberOfConferenceSalons(double numberOfConferenceSalons) {
        this.numberOfConferenceSalons = numberOfConferenceSalons;
    }

    public double getNumberOfSuites() {
        return numberOfSuites;
    }

    public void setNumberOfSuites(double numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public double getNumberOfLimousines() {
        return numberOfLimousines;
    }

    public void setNumberOfLimousines(double numberOfLimousines) {
        this.numberOfLimousines = numberOfLimousines;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "¡¡ Hotel 5 Stars !! numberOfConferenceSalons=" + numberOfConferenceSalons + ", numberOfSuites=" + numberOfSuites + ", numberOfLimousines=" + numberOfLimousines;
    }
}

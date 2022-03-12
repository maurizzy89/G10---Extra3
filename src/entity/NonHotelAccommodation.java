package entity;

public class NonHotelAccommodation extends Accommodation {

    protected boolean priv4te;
    protected double amountM2;

    public NonHotelAccommodation() {
    }

    public NonHotelAccommodation(boolean priv4te, double amountM2, String name, String adress, String locality, String inChargeMan) {
        super(name, adress, locality, inChargeMan);
        this.priv4te = priv4te;
        this.amountM2 = amountM2;
    }

    public boolean isPriv4te() {
        return priv4te;
    }

    public void setPriv4te(boolean priv4te) {
        this.priv4te = priv4te;
    }

    public double getAmountM2() {
        return amountM2;
    }

    public void setAmountM2(double amountM2) {
        this.amountM2 = amountM2;
    }

    @Override
    public String toString() {
        return super.toString() + "NonHotelAccommodation{" + "priv4te=" + priv4te + ", amountM2=" + amountM2 + '}';
    }

}

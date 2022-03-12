package entity;

public class Accommodation {

    protected String name;
    protected String adress;
    protected String locality;
    protected String inChargeMan;

    public Accommodation() {
    }

    public Accommodation(String name, String adress, String locality, String inChargeMan) {
        this.name = name;
        this.adress = adress;
        this.locality = locality;
        this.inChargeMan = inChargeMan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getInChargeMan() {
        return inChargeMan;
    }

    public void setInChargeMan(String inChargeMan) {
        this.inChargeMan = inChargeMan;
    }

    @Override
    public String toString() {
        return "Accommodation{" + "name=" + name + ", adress=" + adress + ", locality=" + locality + ", inChargeMan=" + inChargeMan + '}';
    }

}
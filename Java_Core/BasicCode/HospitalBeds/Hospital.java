package Java_Core.BasicCode.HospitalBeds;

public class Hospital {
    private String name;
    private String city;
    private int availableBeds;

    public Hospital(String name, String city, int availableBeds){
        this.name = name;
        this.city = city;
        this.availableBeds = availableBeds;
    }

    public int getAvailableBeds() {
        return availableBeds;
    }
    public String getCity(){
        return city;
    }
    public String getName(){
        return name;
    }
}

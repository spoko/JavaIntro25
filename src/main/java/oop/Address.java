package oop;

public class Address {
    private String city;
    private String streetName;
    private int postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
            this.city = city;
        }else {
            System.out.println("Error: Invalid entry for city!");
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        if (!streetName.isEmpty()){
            this.streetName = streetName;
        }else {
            System.out.println("Error: Invalid entry for street name!");
        }
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if (postalCode >= 1000 && postalCode <= 9999){//this will check for BG postal code
            this.postalCode = postalCode;
        }else {
            System.out.println("Error: Invalid entry for postal code");
        }
    }
}

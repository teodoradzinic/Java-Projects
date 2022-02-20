public class Address {
    private  String streetName;
    private  int houseNumber;
    private  String city;
    private  String postalCode;


    Address(String postalCode, String city, String streetName, int houseNumber) {
        this.postalCode = postalCode;
        this.city = city;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public void printAddress() {
        System.out.println( "Address: " + postalCode + " " + city + " " + streetName + " " + houseNumber);
    }
    public String addressToString(){
        return  streetName + " " + houseNumber + " " + postalCode + " " + city ;
    }
}

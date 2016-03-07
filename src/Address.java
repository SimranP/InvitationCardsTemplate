public class Address {
    public final String country;
    private String city;
    private String state;

    public Address(String city,String state,String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

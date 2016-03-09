package person;

public class Address {
    public final Country country;
    private final City city;
    private final State state;

    public Address(City city, State state, Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCountry() {
        return country.toString();
    }
}

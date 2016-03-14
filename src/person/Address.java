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

    public String toText() {
        return String.format("%s, %s\n%s",city,state,country);
    }

    public String getCountry() {
        return country.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (country != null ? !country.equals(address.country) : address.country != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return state != null ? state.equals(address.state) : address.state == null;

    }

    @Override
    public int hashCode() {
        int result = country != null ? country.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}

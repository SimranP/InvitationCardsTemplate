package validators;

import person.Person;

import java.util.ArrayList;

public class CountryFilter implements Validator{
    private String nativeCountry;

    public CountryFilter(String country) {
        nativeCountry = country;
    }


    @Override
    public ArrayList<Person> filter(ArrayList<Person> guests) {
        ArrayList<Person> filtered = new ArrayList<Person>();
        for (Person guest : guests) {
            if(guest.isFromCountry(nativeCountry)) filtered.add(guest);
        }
        return filtered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryFilter that = (CountryFilter) o;

        return nativeCountry != null ? nativeCountry.equals(that.nativeCountry) : that.nativeCountry == null;

    }

    @Override
    public int hashCode() {
        return nativeCountry != null ? nativeCountry.hashCode() : 0;
    }
}

package validators;

import person.Person;

import java.util.ArrayList;

public class AgeFilter implements Validator {
    private final int validAge;

    public AgeFilter(int age) {
        validAge = age;
    }

    @Override
    public ArrayList<Person> filter(ArrayList<Person> guests) {
        ArrayList<Person> filtered = new ArrayList<Person>();
        for (Person guest : guests) {
            if(guest.isAboveAge(validAge)) filtered.add(guest);
        }
        return filtered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgeFilter ageFilter = (AgeFilter) o;

        return validAge == ageFilter.validAge;

    }

    @Override
    public int hashCode() {
        return validAge;
    }
}

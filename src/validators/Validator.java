package validators;

import person.Person;

import java.util.ArrayList;


public interface Validator {
    ArrayList<Person> filter(ArrayList<Person> guests);
}

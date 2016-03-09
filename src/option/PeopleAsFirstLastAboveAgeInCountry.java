package option;
import person.Person;

public class PeopleAsFirstLastAboveAgeInCountry implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addAge(person.addCountry(person.firstLast())).toString();
    }
}

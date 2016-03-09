package option;
import person.Person;


public class PeopleAsFirstLastWithCountry implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addCountry(person.firstLast()).toString();
    }
}

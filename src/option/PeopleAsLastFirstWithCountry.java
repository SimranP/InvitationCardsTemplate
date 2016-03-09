package option;
import  person.Person;

public class PeopleAsLastFirstWithCountry implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addCountry(person.lastFirst()).toString();
    }
}

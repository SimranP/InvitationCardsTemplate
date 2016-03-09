package option;
import person.Person;

public class PeopleAsFirstLastAboveAge implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addAge(person.firstLast()).toString();
    }
}

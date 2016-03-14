package option;
import person.FormalFormat;
import person.Person;

public class PeopleAsFirstLastAboveAge implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addAge(person.formatName(new FormalFormat())).toString();
    }
}

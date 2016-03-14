package option;
import person.FormalFormat;
import person.Person;


public class PeopleAsFirstLastWithCountry implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addCountry(person.formatName(new FormalFormat())).toString();
    }
}

package option;
import person.FormalFormat;
import person.Person;

public class PeopleAsFirstLastAboveAgeInCountry implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addAge(person.addCountry(person.formatName(new FormalFormat()))).toString();
    }
}

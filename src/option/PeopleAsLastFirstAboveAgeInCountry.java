package option;
import person.InformalFormat;
import person.Person;

public class PeopleAsLastFirstAboveAgeInCountry implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addAge(person.addCountry(person.formatName(new InformalFormat()))).toString();
    }
}

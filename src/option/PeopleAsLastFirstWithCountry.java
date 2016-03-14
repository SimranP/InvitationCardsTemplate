package option;
import person.InformalFormat;
import  person.Person;

public class PeopleAsLastFirstWithCountry implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addCountry(person.formatName(new InformalFormat())).toString();
    }
}

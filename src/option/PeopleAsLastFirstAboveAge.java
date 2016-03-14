package option;
import person.InformalFormat;
import  person.Person;


public class PeopleAsLastFirstAboveAge implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addAge(person.formatName(new InformalFormat())).toString();
    }
}

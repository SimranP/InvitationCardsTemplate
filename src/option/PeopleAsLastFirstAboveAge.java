package option;
import  person.Person;


public class PeopleAsLastFirstAboveAge implements Option {
    @Override
    public String createLabel(Person person) {
        return person.addAge(person.lastFirst()).toString();
    }
}

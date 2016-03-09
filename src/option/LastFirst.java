package option;

import option.Option;
import person.Person;

public class LastFirst implements Option {
    @Override
    public String createLabel(Person person) {
        return person.lastFirst().toString();
    }
}

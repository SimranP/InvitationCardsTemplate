package option;

import option.Option;
import person.InformalFormat;
import person.Person;

public class LastFirst implements Option {
    @Override
    public String createLabel(Person person) {
        return person.formatName(new InformalFormat()).toString();
    }
}

package option;

import person.FormalFormat;
import person.Person;

public class PeopleAsFirstLastWithAddress implements option.Option {
    @Override
    public String createLabel(Person person) {
        return PeopleAsLastFirstWithAddress.decorate(person.formatName(new FormalFormat()),person.address());
    }
}

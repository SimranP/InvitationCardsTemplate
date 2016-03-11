package option;

import person.Person;
import runner.PeopleAsLastFirstWithAddress;

public class PeopleAsFirstLastWithAddress implements option.Option {
    @Override
    public String createLabel(Person person) {
        return PeopleAsLastFirstWithAddress.decorate(person.firstLast(),person.address());
    }
}

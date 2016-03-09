
public class PeopleAsLastFirstAboveAge implements Options {
    public PeopleAsLastFirstAboveAge() {}

    @Override
    public String createLabel(Person person) {
        return person.lastFirstWithAge();
    }
}

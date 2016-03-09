public class PeopleAsFirstLastAboveAge implements Options {
    public PeopleAsFirstLastAboveAge() {}

    @Override
    public String createLabel(Person person) {
        return person.firstLastWithAge();
    }
}

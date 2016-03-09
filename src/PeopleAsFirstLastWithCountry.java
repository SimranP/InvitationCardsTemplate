public class PeopleAsFirstLastWithCountry implements Options {
    public PeopleAsFirstLastWithCountry() {}

    @Override
    public String createLabel(Person person) {
        return person.firstLastWithCountry();
    }
}

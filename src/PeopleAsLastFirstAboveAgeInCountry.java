public class PeopleAsLastFirstAboveAgeInCountry implements Options {
    public PeopleAsLastFirstAboveAgeInCountry() {}

    @Override
    public String createLabel(Person person) {
        return person.lastFirstWithCountryAndAge();
    }
}

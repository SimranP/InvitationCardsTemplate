public class PeopleAsFirstLastAboveAgeInCountry implements Options {
    @Override
    public String createLabel(Person person) {
        return person.firstLastWithCountryAndAge();
    }
}

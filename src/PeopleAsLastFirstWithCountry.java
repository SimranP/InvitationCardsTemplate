public class PeopleAsLastFirstWithCountry implements Options {
    @Override
    public String createLabel(Person person) {
        return person.lastFirstWithCountry();
    }
}

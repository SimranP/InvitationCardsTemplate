public class LastFirst implements Options {
    @Override
    public String createLabel(Person person) {
        return person.lastFirst();
    }
}

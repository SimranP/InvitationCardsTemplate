public class FirstLast implements Options {
    public FirstLast() {}


    @Override
    public String createLabel(Person person) {
       return person.firstLast();
    }
}

package option;
import person.FormalFormat;
import person.Person;


public class FirstLast implements Option {
    public FirstLast() {}


    @Override
    public String createLabel(Person person) {
       return person.formatName(new FormalFormat()).toString();
    }
}

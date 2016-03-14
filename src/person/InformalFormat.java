package person;

public class InformalFormat implements Formatter {
    @Override
    public String format(String firstName, String lastName) {
        return String.format("%s, %s",lastName,firstName);
    }
}

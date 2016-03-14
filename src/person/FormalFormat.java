package person;

public class FormalFormat implements Formatter {
    @Override
    public String format(String firstName, String lastName) {
        return String.format("%s %s",firstName,lastName);
    }
}

package person;

public class State {
    private final String name;

    public State(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }
}

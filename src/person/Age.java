package person;

public class Age {
    private int age;
    public Age(int age) {
        this.age = age;
    }
    public boolean isGreaterThan(int age){
        return this.age > age;
    }

    @Override
    public String toString() {
        return ""+age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Age age1 = (Age) o;

        return age == age1.age;

    }

    @Override
    public int hashCode() {
        return age;
    }
}

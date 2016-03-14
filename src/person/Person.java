package person;

public class Person {
    private final Name name;
    private final Address address;
    private final Gender gender;
    private final Age age;

    public Person(Name name, Age age, Address address, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (address != null ? !address.equals(person.address) : person.address != null) return false;
        if (gender != person.gender) return false;
        return age != null ? age.equals(person.age) : person.age == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    public static Person parse(String text) {
        String[] details = text.split(",");
        Gender gender = details[2].equals("Male") ? Gender.MALE : Gender.FEMALE;
        Name name = new Name(details[0], details[1]);
        Age age = new Age(Integer.parseInt(details[3]));
        City city = new City(details[4]);
        State state = new State(details[5]);
        Country country = new Country(details[6]);
        Address address = new Address(city, state, country);
        return new Person(name, age, address, gender);
    }

    public Label formatName (Formatter formatter){
        return new Label(String.format("%s %s",gender.getHonorific(),name.format(formatter)));
    }

    public Label addAge(Label label) {
        return label.add(age.toString());
    }

    public Label addCountry(Label label) {
        return label.add(address.getCountry());
    }

    public boolean isAboveAge(int a) {
        return age.isGreaterThan(a);
    }

    public boolean isFromCountry(String country) {
        return address.getCountry().equals(country);
    }

    public Label address() {
        return new Label(address.toText());
    }
}
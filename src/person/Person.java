package person;
import runner.Label;

public class Person {
    private Name name;
    private Address address;
    private Gender gender;
    private Age age;

    public Person(Name name, Age age, Address address, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public Label firstLast(){
        return new Label(name.firstLast(gender.toString()));
    }

    public Label lastFirst(){
        return new Label(name.lastFirst(gender.toString()));
    }

    public Label addAge(Label label){
        return label.add(age.toString());
    }

    public Label addCountry(Label label){ return label.add(address.getCountry()); }

    public boolean isAboveAge(int a) {
        return age.isGreaterThan(a);
    }

    public boolean isFromCountry(String country) {
        return address.getCountry().equals(country);
    }
}
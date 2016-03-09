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

    public String firstLast(){
        return name.firstLast(gender.toString());
    }

    public String lastFirst(){
        return name.lastFirst(gender.toString());
    }

    public String lastFirstWithCountry() {return String.format("%s, %s",lastFirst(),address.getCountry()); }

    public String firstLastWithCountry() {  return String.format("%s, %s",firstLast(),address.getCountry()); }

    public String lastFirstWithCountryAndAge() { return String.format("%s, %s",lastFirstWithCountry(),age); }

    public String firstLastWithCountryAndAge() { return String.format("%s, %s",firstLastWithCountry(),age); }

    public boolean isAboveAge(int a) {
        return age.isGreaterThan(a);
    }

    public boolean isFromCountry(String country) {
        return address.getCountry().equals(country);
    }

    public String firstLastWithAge() { return String.format("%s, %s",firstLast(),age); }


    public String lastFirstWithAge() {
        return String.format("%s, %s",lastFirst(),age);
    }
}
public class Person {
    private Name name;
    private Address address;
    private String gender;
    private String age;
    private String honirific;

    public Person(String[] details) {
        this.name = new Name(details[0],details[1]);
        this.gender = details[2];
        this.age = details[3];
        this.address = new Address(details[4],details[5],details[6]);
        this.honirific = honorific();
    }

    private String honorific() {
        return isMale()? Gender.MALE.toString():Gender.FEMALE.toString();
    }

    private boolean isMale() {
        return gender == "Male";
    }

    public String firstLast(){
        return name.firstLast(honirific);
    }

    public String lastFirst(){
        return name.lastFirst(honirific);
    }

    public String getFirstLastwithCountry() {
        return firstLast()+", "+address.getCountry();
    }

    public String getFirstLastwithCountry(String seperator) {
        return honirific+" " +name.firstLastwithComma()+", "+address.getCountry();
    }
}

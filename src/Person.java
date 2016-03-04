public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String age;
    private String city;
    private String state;
    private String country;

    public Person(String[] details) {
        this.firstName = details[0];
        this.lastName = details[1];
        this.gender = details[2];
        this.age = details[3];
        this.city = details[4];
        this.state = details[5];
        this.country = details[6];
    }

    public String firstLast(String seperator){
        return honorific()+ " " +firstName+seperator+ lastName;
    }

    public String honorific(){
        if(gender.equals("Male"))
            return Gender.MALE.toString();
        return Gender.FEMALE.toString();
    }

    public String lastFirst(String seperator) {
        return honorific()+ seperator + lastName +seperator+firstName;
    }

    public String getFirstLastwithCountry(String seperator){
       return firstLast(" ") + seperator + country;
    }

    public String getFirstLastwithCountry(String seperator1 ,String seperator2){
        return firstLast(seperator1)+seperator2+country;
    }

}

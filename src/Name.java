public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstLast(String honorific){
        return honorific+" "+firstName+" "+lastName;
    }

    public String lastFirst(String honorific){
        return  honorific+" "+lastName+", "+firstName;
    }


}

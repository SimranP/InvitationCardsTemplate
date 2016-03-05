public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstLast(){
        return firstName+" "+lastName;
    }

    public String firstLast(String title){
        return title +" " +firstLast();
    }

    public String lastFirst(){
        return lastName+" "+firstName;
    }

    public String lastFirst(String title){
        return title +" " +lastFirst();
    }

    public String firstLastwithComma() {
        return firstName+", "+lastName;
    }
}

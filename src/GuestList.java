import java.util.ArrayList;
import java.util.HashMap;

public class GuestList {
    private HashMap<String,ArrayList<Person>> guests;

    public GuestList() {
        guests = new HashMap<String ,ArrayList<Person>>();
    }

    public void add(Person person) {
        ArrayList<Person>personList;
       String country =  person.getCountry();
        if(guests.get(country)==null) {
            personList = new ArrayList<Person>();
            guests.put(country, personList);
        }
        guests.get(country).add(person);
    }

    @Override
    public String toString() {
        return guests.toString();
    }

    public int size() {
        return guests.size();
    }

    private ArrayList<Person> listGuestsFrom(String country) {
       return guests.get(country);
    }

    public String listGuestswithCountry(String country) {
        String output = "";
        ArrayList<Person> list = listGuestsFrom(country);
        int size = list.size();
        for (int i = 0; i < size-1; i++) {
            output += list.get(i).firstLastWithCountry()+"\n";
        }
        output += list.get(size-1).firstLastWithCountry();
        return output;
    }
}

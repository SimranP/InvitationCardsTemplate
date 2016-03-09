import java.util.ArrayList;
import java.util.HashMap;

public class GuestList {
    HashMap<String, Options> labelChoices = new HashMap<String, Options>();
    private ArrayList<Person> guests;

    public GuestList() {
        initializeChoices();
        guests = new ArrayList<Person>();
    }

    public void add(Person person) {
        guests.add(person);
    }

    @Override
    public String toString() {
        return guests.toString();
    }

    public int size() {
        return guests.size();
    }

    private void initializeChoices() {
        labelChoices.put("firstLast", new FirstLast());
        labelChoices.put("lastFirst", new LastFirst());
        labelChoices.put("firstLastWithCountry", new PeopleAsFirstLastWithCountry());
        labelChoices.put("lastFirstWithCountry", new PeopleAsLastFirstWithCountry());
        labelChoices.put("peopleAsFirstLastAboveAgeInCountry", new PeopleAsFirstLastAboveAgeInCountry());
        labelChoices.put("peopleAsLastFirstAboveAgeInCountry", new PeopleAsLastFirstAboveAgeInCountry());
        labelChoices.put("peopleAsLastFirstWithAge",  new PeopleAsLastFirstAboveAge());
        labelChoices.put("peopleAsFirstLastWithAge",  new PeopleAsFirstLastAboveAge());
    }

    public String printLabels(String option){
        ArrayList<String> labels = new ArrayList<String>();
        for (Person guest : guests) {
            labels.add(labelChoices.get(option).createLabel(guest));
        }
        return join(labels,"\n");
    }

    public String printLabels(String option, String country){
        GuestList guestsList = filterByCountry(country);
        return guestsList.printLabels(option);
    }

    private GuestList filterByCountry(String country) {
        GuestList guestList = new GuestList();
        for (Person guest : guests)
            if(guest.isFromCountry(country))  guestList.add(guest);
        return  guestList;
    }

    private String join(ArrayList<String> labels, String joiner) {
        String output = "";
        int size = labels.size();
        for (int counter = 0; counter < size-1; counter++) {
            output = output.concat(labels.get(counter) + joiner);
        }
        output = output.concat(labels.get(size-1));
        return output;
    }

    public String printLabels(String option, String country, int age) {
        GuestList filteredList = filterByCountry(country).filterByAge(age);
        return filteredList.printLabels(option);

    }

    private GuestList filterByAge(int age) {
        GuestList guestList = new GuestList();
        for (Person guest : guests)
            if(guest.isAboveAge(age))  guestList.add(guest);
        return  guestList;
    }
}
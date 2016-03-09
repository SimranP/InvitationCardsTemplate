package runner;

import person.Person;

import java.util.ArrayList;

public class GuestList {
    LabelChoices labelChoices = new LabelChoices();
    private ArrayList<Person> guests;

    public GuestList() {
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



    public String printLabels(String option){
        ArrayList<String> labels = new ArrayList<String>();
        for (Person guest : guests) {
            labels.add(labelChoices.applyChoiceOn(option,guest));
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
        for (int counter = 0; counter < size-1; counter++)
            output = output.concat(labels.get(counter) + joiner);
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
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
        String[] labels = new String[guests.size()];
        for (int i = 0; i < labels.length ; i++)
            labels[i] = labelChoices.applyChoiceOn(option,guests.get(i));
        return String.join("\n",labels);
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

    public String printLabels(String option, String country, int age) {
        GuestList filteredList = filterByCountry(country).filterByAge(age);
        return filteredList.printLabels(option);

    }

    public String printLabels(String option,int age){
        GuestList filteredList = filterByAge(age);
        return filteredList.printLabels(option);
    }

    private GuestList filterByAge(int age) {
        GuestList guestList = new GuestList();
        for (Person guest : guests)
            if(guest.isAboveAge(age))  guestList.add(guest);
        return  guestList;
    }
}
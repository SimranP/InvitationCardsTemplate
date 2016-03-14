package runner;

import option.Option;
import person.Person;

import java.util.ArrayList;
import java.util.Set;

import validators.Validator;

public class GuestList {
    private ArrayList<Person> guests;

    public GuestList() {
        guests = new ArrayList<Person>();
    }

    public static GuestList parse(String content){
        GuestList guestList = new GuestList();
        String[] peopleDetails = content.split("\n");
        for (String personDetails : peopleDetails) {
            guestList.add(Person.parse(personDetails));
        }
        return guestList;
    }

    public void add(Person person) {
        guests.add(person);
    }

    public int size() {
        return guests.size();
    }

    public String generateLabels(Option option){
        String[] labels = new String[guests.size()];
        for (int i = 0; i < labels.length ; i++)
            labels[i] = option.createLabel(guests.get(i));
        return String.join("\n",labels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuestList guestList = (GuestList) o;

        return guests != null ? guests.equals(guestList.guests) : guestList.guests == null;

    }

    @Override
    public int hashCode() {
        return guests != null ? guests.hashCode() : 0;
    }

    public GuestList applyFilters(Set<Validator> filters) {
        GuestList guestList = new GuestList();
        guestList.guests = guests;
        for (Validator filter : filters) {
            guestList.guests = filter.filter(guestList.guests);
        }
        return guestList;
    }
}
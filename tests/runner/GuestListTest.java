package runner;

import option.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import person.*;
import validators.AgeFilter;
import validators.CountryFilter;
import validators.Validator;

import java.util.HashSet;
import java.util.Set;


public class GuestListTest {
    Person person =  new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
    Person person1 = new Person(new Name("Melody","Dooley"),new Age(19),new Address(new City("West Shanna"),new State("Vermont"),new Country("Macedonia")),Gender.FEMALE);
    Person person2 = new Person(new Name("Jane","Dooley"),new Age(19),new Address(new City("West Shanna"),new State("Vermont"),new Country("Bangladesh")),Gender.FEMALE);

    @Test
    public void add_method_adds_a_person_into_the_guestList_according_to_the_country_person_belongs_to() throws Exception {
        GuestList queenParty = new GuestList();

        assertEquals(0,queenParty.size());
        queenParty.add(person);
        assertEquals(1,queenParty.size());
        queenParty.add(person1);
        assertEquals(2,queenParty.size());
        queenParty.add(person2);
        assertEquals(3,queenParty.size());
    }

    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_when_option_is_firstLast() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Jaclyn Bartoletti\n" + "Ms Melody Dooley\n" + "Ms Jane Dooley",queenParty.generateLabels(new FirstLast()));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_when_option_is_lastFirst() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Bartoletti, Jaclyn\n" + "Ms Dooley, Melody\n" + "Ms Dooley, Jane",queenParty.generateLabels(new LastFirst()));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_and_country_when_option_is_lastFirstWithCountry() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new CountryFilter("Bangladesh"));
        queenParty = queenParty.applyFilters(filters);
        assertEquals("Ms Dooley, Jane, Bangladesh",queenParty.generateLabels(new PeopleAsLastFirstWithCountry()));
    }


    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_and_country_when_option_is_firstLastWithCountry() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new CountryFilter("Macedonia"));
        queenParty = queenParty.applyFilters(filters);
        assertEquals("Mr Jaclyn Bartoletti, Macedonia\n" + "Ms Melody Dooley, Macedonia",queenParty.generateLabels(new PeopleAsFirstLastWithCountry()));
    }

    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_and_country_and_age_when_option_is_firstLastWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);

        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new CountryFilter("Macedonia"));
        filters.add(new AgeFilter(20));

        queenParty = queenParty.applyFilters(filters);

        assertEquals("Mr Jaclyn Bartoletti, Macedonia, 31",queenParty.generateLabels(new PeopleAsFirstLastAboveAgeInCountry()));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_and_country_and_age_when_option_is_lastFirstWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);

        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new CountryFilter("Macedonia"));
        filters.add(new AgeFilter(20));

        queenParty = queenParty.applyFilters(filters);

        assertEquals("Mr Bartoletti, Jaclyn, Macedonia, 31",queenParty.generateLabels(new PeopleAsLastFirstAboveAgeInCountry()));
    }

    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_and_age_when_option_is_firstLastWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);

        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new CountryFilter("Macedonia"));
        filters.add(new AgeFilter(20));

        queenParty = queenParty.applyFilters(filters);

        assertEquals("Mr Jaclyn Bartoletti, 31",queenParty.generateLabels(new PeopleAsFirstLastAboveAge()));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_and_age_when_option_is_lastFirstWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);

        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new CountryFilter("Macedonia"));
        filters.add(new AgeFilter(20));

        queenParty = queenParty.applyFilters(filters);

        assertEquals("Mr Bartoletti, Jaclyn, 31",queenParty.generateLabels(new PeopleAsLastFirstAboveAge()));
    }

    @Test
    public void parse_parses_given_content_and_gives_a_guestList() throws Exception {
        GuestList parsedguestList = GuestList.parse("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania");
         assertEquals(parsedguestList.size(),3);
    }

    @Test
    public void equals_tells_if_the_the_given_object_is_equals_to_the_guest_list() throws Exception {
        GuestList parsedguestList = GuestList.parse("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania");
         Person person = new Person(new Name("Julius","Barrows"),new Age(18),new Address(new City("Veda haven"),new State("Vermont"),new Country("Macedonia")),Gender.FEMALE);
         Person person1 = new Person(new Name("Melody","Dooley"),new Age(31),new Address(new City("West Shanna"),new State("Vermont"),new Country("Bangladesh")),Gender.FEMALE);
         Person person2 = new Person(new Name("Gavin","Hyatt"),new Age(36),new Address(new City("Crooks ton"),new State("Illinois"),new Country("Romania")),Gender.MALE);
        GuestList guestList = new GuestList();
        guestList.add(person);
        guestList.add(person1);
        guestList.add(person2);
        assertTrue(parsedguestList.equals(guestList));
    }

    @Test
    public void equals_tells_if_the_the_given_object_is_not_equals_to_the_guest_list() throws Exception {
        GuestList parsedguestList = GuestList.parse("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\n" +
                "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania");
         Person person = new Person(new Name("Julius","Barrows"),new Age(18),new Address(new City("Veda Haven"),new State("Vermont"),new Country("Macedonia")),Gender.FEMALE);
         Person person1 = new Person(new Name("Melody","Dooley"),new Age(31),new Address(new City("West Shanna"),new State("Vermont"),new Country("Bangladesh")),Gender.FEMALE);
         Person person2 = new Person(new Name("Roma","Hyatt"),new Age(36),new Address(new City("Crooks ton"),new State("Illinois"),new Country("Romania")),Gender.MALE);
        GuestList guestList = new GuestList();
        guestList.add(person);
        guestList.add(person1);
        guestList.add(person2);
        assertFalse(parsedguestList.equals(guestList));
    }

    @Test
    public void applyFilter_apply_filters_on_the_list_and_returns_a_filtered_guestList_with_one_filter() throws Exception {
        GuestList queenParty = new GuestList();
            queenParty.add(person);
            queenParty.add(person1);
            queenParty.add(person2);
        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new AgeFilter(18));
        filters.add(new CountryFilter("Bangladesh"));
        GuestList filteredList = queenParty.applyFilters(filters);
        GuestList expectedFilteredGuestList = new GuestList();
        expectedFilteredGuestList.add(person2);
        assertTrue(expectedFilteredGuestList.equals(filteredList));
    }

    @Test
    public void applyFilter_apply_filters_on_the_list_and_returns_a_filtered_guestList_with_no_filter() throws Exception {
        GuestList queenParty = new GuestList();
            queenParty.add(person);
            queenParty.add(person1);
            queenParty.add(person2);
        Set<Validator> filters = new HashSet<Validator>();
        GuestList filteredList = queenParty.applyFilters(filters);
        assertTrue(queenParty.equals(filteredList));
    }

    @Test
    public void applyFilter_apply_filters_on_the_list_and_returns_a_filtered_guestList_with_two_filters() throws Exception {
        GuestList queenParty = new GuestList();
            queenParty.add(person);
            queenParty.add(person1);
            queenParty.add(person2);
        Set<Validator> filters = new HashSet<Validator>();
        filters.add(new CountryFilter("Bangladesh"));

        GuestList filteredList = queenParty.applyFilters(filters);
        GuestList expectedFilteredGuestList = new GuestList();
        expectedFilteredGuestList.add(person2);
        assertTrue(expectedFilteredGuestList.equals(filteredList));
    }
}
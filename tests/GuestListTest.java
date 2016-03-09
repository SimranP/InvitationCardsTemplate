import org.junit.Before;
import org.junit.Test;
import person.*;
import runner.GuestList;

import static org.junit.Assert.*;

public class GuestListTest {
    Person person,person1,person2;

    @Before
    public void setUp() throws Exception {
      person =  new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
      person1 =  new Person(new Name("Melody","Dooley"),new Age(19),new Address(new City("West Shanna"),new State("Vermont"),new Country("Macedonia")),Gender.FEMALE);
      person2 =  new Person(new Name("Jane","Dooley"),new Age(19),new Address(new City("West Shanna"),new State("Vermont"),new Country("Bangladesh")),Gender.FEMALE);
    }

    @Test
    public void add_method_adds_a_person_into_the_guestList_according_to_the_country_person_belongs_to() throws Exception {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals(3,queenParty.size());
    }

    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_when_option_is_firstLast() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Jaclyn Bartoletti\n" + "Ms Melody Dooley\n" + "Ms Jane Dooley",queenParty.printLabels("firstLast"));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_when_option_is_lastFirst() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Bartoletti, Jaclyn\n" + "Ms Dooley, Melody\n" + "Ms Dooley, Jane",queenParty.printLabels("lastFirst"));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_and_country_when_option_is_lastFirstWithCountry() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Ms Dooley, Jane, Bangladesh",queenParty.printLabels("lastFirstWithCountry","Bangladesh"));
    }


    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_and_country_when_option_is_firstLastWithCountry() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Jaclyn Bartoletti, Macedonia\n" + "Ms Melody Dooley, Macedonia",queenParty.printLabels("firstLastWithCountry","Macedonia"));
    }

    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_and_country_and_age_when_option_is_firstLastWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Jaclyn Bartoletti, Macedonia, 31",queenParty.printLabels("peopleAsFirstLastAboveAgeInCountry","Macedonia",20));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_and_country_and_age_when_option_is_lastFirstWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Bartoletti, Jaclyn, Macedonia, 31",queenParty.printLabels("peopleAsLastFirstAboveAgeInCountry","Macedonia",20));
    }

    @Test
    public void printLabels_prints_labels_as_first_name_and_last_name_and_age_when_option_is_firstLastWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Jaclyn Bartoletti, 31",queenParty.printLabels("peopleAsFirstLastWithAge","Macedonia",20));
    }

    @Test
    public void printLabels_prints_labels_as_last_name_and_first_name_and_age_when_option_is_lastFirstWithCountryAboveAge() {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        queenParty.add(person2);
        assertEquals("Mr Bartoletti, Jaclyn, 31",queenParty.printLabels("peopleAsLastFirstWithAge","Macedonia",20));
    }
}
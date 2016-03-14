package person;

import org.junit.Before;
import org.junit.Test;
import person.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    Person jaclyn;

    @Before
    public void setUp() throws Exception {
        jaclyn = new Person(new Name("Jaclyn","Bartoletti"),new Age(22),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
    }

    @Test
    public void firstLast_represent_name_in_first_name_and_last_name() throws Exception {
        assertEquals(jaclyn.formatName(new FormalFormat()).toString(),"Mr Jaclyn Bartoletti");
    }

    @Test
    public void lastFirst_represent_name_in_last_name_and_first_name() throws Exception {
        assertEquals(jaclyn.formatName(new InformalFormat()).toString(),"Mr Bartoletti, Jaclyn");
    }

    @Test
    public void isAboveAge_tells_if_the_person_is_not_above_than_the_given_age() throws Exception {
        assertEquals(false,jaclyn.isAboveAge(25));
    }

    @Test
    public void isAboveAge_tells_if_the_person_is_above_than_the_given_age() throws Exception {
        assertEquals(true,jaclyn.isAboveAge(20));
    }

    @Test
    public void addAge_adds_age_to_the_given_label() throws Exception {
        assertEquals(jaclyn.addAge(jaclyn.formatName(new FormalFormat())).toString(),"Mr Jaclyn Bartoletti, 22");
    }

    @Test
    public void isFromCountry_tells_if_person_is_from_given_country() throws Exception {
        assertTrue(jaclyn.isFromCountry("Macedonia"));
    }

    @Test
    public void isFromCountry_tells_if_person_is_not_from_given_country() throws Exception {
        assertFalse(jaclyn.isFromCountry("Bangladesh"));
    }

    @Test
    public void addCountry_adds_country_to_the_given_label() throws Exception {
        assertEquals(jaclyn.addCountry(jaclyn.formatName(new FormalFormat())).toString(),"Mr Jaclyn Bartoletti, Macedonia");
    }

    @Test
    public void parse_parses_given_content_and_returns_a_person() throws Exception {
        Person parsedPerson = Person.parse("Jaclyn,Bartoletti,Male,31,Veda haven,North Carolina,Macedonia");
        Person person = new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
        assertTrue(person.equals(parsedPerson));
    }
}
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
        assertEquals(jaclyn.firstLast().toString(),"Mr Jaclyn Bartoletti");
    }

    @Test
    public void lastFirst_represent_name_in_last_name_and_first_name() throws Exception {
        assertEquals(jaclyn.lastFirst().toString(),"Mr Bartoletti, Jaclyn");
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
        assertEquals(jaclyn.addAge(jaclyn.firstLast()).toString(),"Mr Jaclyn Bartoletti, 22");
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
        assertEquals(jaclyn.addCountry(jaclyn.firstLast()).toString(),"Mr Jaclyn Bartoletti, Macedonia");
    }
}
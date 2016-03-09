import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest
{
    Person jaclyn;

    @Before
    public void setUp() throws Exception {
        jaclyn = new Person(new Name("Jaclyn","Bartoletti"),new Age(22),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")),Gender.MALE);
    }

    @Test
    public void firstLast_represent_name_in_first_name_and_last_name() throws Exception {
        assertEquals(jaclyn.firstLast(),"Mr Jaclyn Bartoletti");
    }

    @Test
    public void lastFirst_represent_name_in_last_name_and_first_name() throws Exception {
        assertEquals(jaclyn.lastFirst(),"Mr Bartoletti, Jaclyn");
    }
    @Test
    public void getFirstLastwithCountry_gives_first_name_and_last_name_and_country() throws Exception {
        assertEquals(jaclyn.firstLastWithCountry(),"Mr Jaclyn Bartoletti, Macedonia");
    }

    @Test
    public void lastFirstwithCountry_gives_last_name_and_first_name_and_country() throws Exception {
        assertEquals(jaclyn.lastFirstWithCountry(),"Mr Bartoletti, Jaclyn, Macedonia");
    }

    @Test
    public void lastFirstWithCountryAndAge_gives_first_name_and_last_name_and_country_and_age() throws Exception {
        assertEquals(jaclyn.lastFirstWithCountryAndAge(),"Mr Bartoletti, Jaclyn, Macedonia, 22");
    }

    @Test
    public void lastFirstWithCountryAndAge_gives_last_name_and_first_name_and_country_and_age() throws Exception {
        assertEquals(jaclyn.lastFirstWithCountryAndAge(),"Mr Bartoletti, Jaclyn, Macedonia, 22");
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
    public void firstLastWithAge_gives_first_name_and_last_name_and_age() throws Exception {
        assertEquals(jaclyn.firstLastWithAge(),"Mr Jaclyn Bartoletti, 22");
    }

    @Test
    public void lastFirstWithAge_gives_last_name_and_first_name_and_age() throws Exception {
        assertEquals(jaclyn.lastFirstWithAge(),"Mr Bartoletti, Jaclyn, 22");
    }

    @Test
    public void isFromCountry_tells_if_person_is_from_given_country() throws Exception {
        assertTrue(jaclyn.isFromCountry("Macedonia"));
    }

    @Test
    public void isFromCountry_tells_if_person_is_not_from_given_country() throws Exception {
        assertFalse(jaclyn.isFromCountry("Bangladesh"));
    }
}
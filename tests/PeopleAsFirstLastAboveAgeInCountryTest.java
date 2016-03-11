import option.PeopleAsFirstLastAboveAgeInCountry;
import org.junit.Test;
import person.*;

import static org.junit.Assert.assertEquals;

public class PeopleAsFirstLastAboveAgeInCountryTest {
    @Test
    public void createLabel_create_a_label_consisiting_first_name_and_last_name_and_country_and_age() throws Exception {
        PeopleAsFirstLastAboveAgeInCountry withCountryAndAge = new PeopleAsFirstLastAboveAgeInCountry();
        Person person = new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
        assertEquals("Mr Jaclyn Bartoletti, Macedonia, 31",withCountryAndAge.createLabel(person));
    }
}
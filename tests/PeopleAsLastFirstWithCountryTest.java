import option.PeopleAsLastFirstWithCountry;
import org.junit.Test;
import person.*;

import static org.junit.Assert.*;

public class PeopleAsLastFirstWithCountryTest {
    @Test
    public void createLabel_creates_a_label_consisting_last_name_and_first_name_and_country() throws Exception {
        Person person =  new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
        PeopleAsLastFirstWithCountry withCountry = new PeopleAsLastFirstWithCountry();
        assertEquals("Mr Bartoletti, Jaclyn, Macedonia",withCountry.createLabel(person));
    }
}
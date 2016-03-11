import org.junit.Test;
import static org.junit.Assert.assertEquals;
import option.PeopleAsFirstLastWithCountry;
import person.*;

public class PeopleAsFirstLastWithCountryTest {
    @Test
    public void createLabel_creates_a_label_consisting_first_name_and_last_name_and_country() throws Exception {
        PeopleAsFirstLastWithCountry withCountry = new PeopleAsFirstLastWithCountry();
        Person person =  new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
        assertEquals("Mr Jaclyn Bartoletti, Macedonia",withCountry.createLabel(person));
    }
}
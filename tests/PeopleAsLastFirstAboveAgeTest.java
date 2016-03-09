import option.PeopleAsLastFirstAboveAge;
import org.junit.Test;
import person.*;

import static org.junit.Assert.*;

public class PeopleAsLastFirstAboveAgeTest {
    @Test
    public void createLabel_creates_a_label_consisting_last_name_and_first_name_and_age() throws Exception {
        PeopleAsLastFirstAboveAge withAge = new PeopleAsLastFirstAboveAge();
        Person person =  new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
        assertEquals("Mr Bartoletti, Jaclyn, 31",withAge.createLabel(person));
    }
}
import option.PeopleAsFirstLastAboveAge;
import org.junit.Test;
import person.*;

import static org.junit.Assert.assertEquals;

public class PeopleAsFirstLastAboveAgeTest {
    @Test
    public void createLabel() throws Exception {
        PeopleAsFirstLastAboveAge withAge = new PeopleAsFirstLastAboveAge();
        Person person =  new Person(new Name("Jaclyn","Bartoletti"),new Age(31),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Macedonia")), Gender.MALE);
        assertEquals("Mr Jaclyn Bartoletti, 31",withAge.createLabel(person));
    }
}
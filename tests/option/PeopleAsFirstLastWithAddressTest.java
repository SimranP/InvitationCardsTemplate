package option;

import org.junit.Assert;
import org.junit.Test;
import person.*;

public class PeopleAsFirstLastWithAddressTest {
    @Test
    public void createLabel_creates_label_consisting_first_name_last_name_address_with_borders() throws Exception {
        PeopleAsFirstLastWithAddress withAddress = new PeopleAsFirstLastWithAddress();
        Person person =  new Person(new Name("Shruti","Bartoletti"),new Age(21),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Canada")), Gender.FEMALE);
        Assert.assertEquals(withAddress.createLabel(person),"+----------------------------+\n" +
                "| Ms Shruti Bartoletti       |\n" +
                "|----------------------------|\n" +
                "| Veda haven, North Carolina |\n" +
                "| Canada                     |\n" +
                "+----------------------------+"
        );

    }
}
package option;

import option.PeopleAsLastFirstWithAddress;
import org.junit.Test;
import person.*;

import static org.junit.Assert.assertEquals;


public class PeopleAsLastFirstWithAddressTest {
    @Test
    public void decorate_puts_borders_around_given_to_Labels() throws Exception {
        Label label1 = new Label("Shruti Chakaraborty");
        Label label2 = new Label("Bangalore, Karnataka\n India");
        assertEquals(PeopleAsLastFirstWithAddress.decorate(label1,label2),"+----------------------+\n" +
                        "| Shruti Chakaraborty  |\n" +
                        "|----------------------|\n" +
                        "| Bangalore, Karnataka |\n" +
                        "|  India               |\n" +
                        "+----------------------+"
                );
    }

    @Test
    public void testCreateLabel() throws Exception {
        PeopleAsLastFirstWithAddress withAddress = new PeopleAsLastFirstWithAddress();
        Person person =  new Person(new Name("Shruti","Bartoletti"),new Age(21),new Address(new City("Veda haven"), new State("North Carolina"), new Country("Canada")), Gender.FEMALE);
        assertEquals(withAddress.createLabel(person),"+----------------------------+\n" +
                "| Ms Bartoletti, Shruti      |\n" +
                "|----------------------------|\n" +
                "| Veda haven, North Carolina |\n" +
                "| Canada                     |\n" +
                "+----------------------------+");
    }
}
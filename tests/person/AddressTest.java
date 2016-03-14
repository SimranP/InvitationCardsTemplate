package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AddressTest {
    @Test
    public void equals_tells_if_the_given_object_is_equals_to_the_address() throws Exception {
        Address address = new Address(new City("Delhi"), new State("Delhi"), new Country("India"));
        assertTrue(address.equals(new Address(new City("Delhi"),new State("Delhi"),new Country("India"))));
    }

    @Test
    public void equals_tells_if_the_given_object_is_not_equals_to_the_address() throws Exception {
        Address address = new Address(new City("Lucknow"), new State("Delhi"), new Country("India"));
        assertFalse(address.equals(new Address(new City("Delhi"),new State("Delhi"),new Country("India"))));
    }

    @Test
    public void toText_gives_the_address_in_address_text_format() throws Exception {
        Address address = new Address(new City("Lucknow"), new State("Delhi"), new Country("India"));
        assertEquals("Lucknow, Delhi\nIndia",address.toText());
    }
}
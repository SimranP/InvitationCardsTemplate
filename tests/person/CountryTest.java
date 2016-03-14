package person;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryTest {
    @Test
    public void equals_tells_if_the_given_object_is_equals_to_the_country() throws Exception {
        Country bangladesh = new Country("Bangladesh");
        assertTrue(bangladesh.equals(new Country("Bangladesh")));
    }

    @Test
    public void equals_tells_if_the_given_object_is_not_equals_to_the_country() throws Exception {
        Country bangladesh = new Country("Bangladesh");
        assertFalse(bangladesh.equals(new City("Bangladesh")));
    }
}
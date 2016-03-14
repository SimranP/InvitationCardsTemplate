package person;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {
    @Test
    public void equals_tells_if_the_given_object_is_equals_to_the_city() throws Exception {
        City bangladesh = new City("Lucknow");
        assertTrue(bangladesh.equals(new City("Lucknow")));
    }

    @Test
    public void equals_tells_if_the_given_object_is_not_equals_to_the_city() throws Exception {
        City bangladesh = new City("Lucknow");
        assertFalse(bangladesh.equals(new City("New york")));
    }
}
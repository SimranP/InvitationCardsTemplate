package person;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AgeTest {

    @Test
    public void isGreaterThan_tells_if_the_age_is_not_greater_than_the_given_age() throws Exception {
        Age age = new Age(18);
        assertFalse(age.isGreaterThan(20));
    }

    @Test
    public void isGreaterThan_tells_if_the_age_is_greater_than_the_given_age() throws Exception {
        Age age = new Age(20);
        assertTrue(age.isGreaterThan(18));
    }

    @Test
    public void equals_tells_if_the_given_object_is_equal_to_age() throws Exception {
        Age age = new Age(20);
        assertTrue(age.equals(new Age(20)));
    }

    @Test
    public void equals_tells_if_the_given_object_is_not_equal_to_age() throws Exception {
        Age age = new Age(20);
        assertFalse(age.equals(new Age(10)));
    }
}
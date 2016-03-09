import org.junit.Test;
import person.Age;

import static org.junit.Assert.*;

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
}
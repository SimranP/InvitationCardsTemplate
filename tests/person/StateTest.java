package person;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StateTest {
    @Test
    public void equals_tells_if_the_given_object_is_equals_to_the_state() throws Exception {
        State up = new State("Uttar Pradesh");
        assertTrue(up.equals(new State("Uttar Pradesh")));
    }

    @Test
    public void equals_tells_if_the_given_object_is_not_equals_to_the_state() throws Exception {
        State up = new State("Uttar Pradesh");
        assertFalse(up.equals(new State("Delhi")));
    }
}
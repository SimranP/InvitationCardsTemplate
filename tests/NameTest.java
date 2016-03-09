import org.junit.Test;
import person.Name;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void testFirstLast_gives_name_in_first_last_format_with_the_given_honorific() throws Exception {
        Name name = new Name("Barack", "Obama");
        assertEquals(name.firstLast("Mr"),"Mr Barack Obama");
    }

    @Test
    public void testLastFirst() throws Exception {
        Name name = new Name("Michelle", "Obama");
        assertEquals(name.lastFirst("Ms"),"Ms Obama, Michelle");
    }
}
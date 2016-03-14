package person;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class NameTest {

    @Test
    public void format_gives_firstLastFormat_when_given_format_is_FormalFormat() throws Exception {
        Name name = new Name("Barack", "Obama");
        Formatter firstLast = new FormalFormat() ;
        assertEquals(name.format(firstLast),"Barack Obama");
    }

    @Test
    public void format_gives_firstLastFormat_when_given_format_is_InformalFormat() throws Exception {
        Name name = new Name("Michelle", "Obama");
        Formatter lastFirst = new InformalFormat() ;
        assertEquals(name.format(lastFirst),"Obama, Michelle");
    }

    @Test
    public void equals_tells_if_the_given_object_is_equals_to_name() throws Exception {
        Name name = new Name("Michelle", "Obama");
        assertTrue(name.equals(new Name("Michelle", "Obama")));
    }

    @Test
    public void equals_tells_if_the_given_object_is_not_equals_to_name() throws Exception {
        Name name = new Name("Barack", "Obama");
        assertFalse(name.equals(new Name("Michelle", "Obama")));
    }
}
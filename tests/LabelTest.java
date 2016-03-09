import org.junit.Test;
import runner.Label;

import static org.junit.Assert.*;

public class LabelTest {
    @Test
    public void add_adds_given_content_to_the_label() throws Exception {
        Label label = new Label("Ms Clara Rockmore");
        assertEquals("Ms Clara Rockmore, Theremenist",label.add("Theremenist").toString());
    }
}
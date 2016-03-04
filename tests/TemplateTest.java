import org.junit.Test;
import static org.junit.Assert.*;

public class TemplateTest
{
    @Test
    public void template_adds_fields_and_takes_content_and_gives_a_string_representation_with_spaces() throws Exception {
        Template nameTemplate = new Template();
        nameTemplate.addField("firstName");
        nameTemplate.addField("lastName");
        nameTemplate.takeContent(new String[]{"simran", "pal"});
        assertEquals("simran pal",nameTemplate.toString());
    }

    @Test
    public void two_templates_can_be_joined() throws Exception {
        Template nameTemplate = new Template();
        nameTemplate.addField("Prefix");
        nameTemplate.addField("firstName");
        nameTemplate.addField("lastName");
        nameTemplate.takeContent(new String[]{"Ms.","Simran", "Pal"});

        Template placeTemplate = new Template();
        placeTemplate.addField("city");
        placeTemplate.takeContent(new String[]{"Meerut"});

        Template t = nameTemplate.join(placeTemplate);
        assertEquals("Ms. Simran Pal Meerut",t.toString());
    }
}

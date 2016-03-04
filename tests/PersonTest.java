import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void firstLast_represent_name_in_first_name_and_last_name() throws Exception {
        Person jaclyn = new Person(new String[]{"Jaclyn", "Bartoletti", "Male", "22", "Veda haven", "North Carolina", "Macedonia"});
        assertEquals(jaclyn.firstLast(" "),"Mr. Jaclyn Bartoletti");
    }

    @Test
    public void lastFirst_represent_name_in_last_name_and_first_name() throws Exception {
        Person jaclyn = new Person(new String[]{"Jaclyn", "Bartoletti", "Male", "22", "Veda haven", "North Carolina", "Macedonia"});
        assertEquals(jaclyn.lastFirst(" "),"Mr. Bartoletti Jaclyn");
    }
    @Test
    public void getFirstLastwithCountry_represent_name_in_first_name_and_last_name_and_country() throws Exception {
        Person jaclyn = new Person(new String[]{"Jaclyn", "Bartoletti", "Male", "22", "Veda haven", "North Carolina", "Macedonia"});
        assertEquals(jaclyn.getFirstLastwithCountry(", "),"Mr. Jaclyn Bartoletti, Macedonia");
        assertEquals(jaclyn.getFirstLastwithCountry(", ",", "),"Mr. Jaclyn, Bartoletti, Macedonia");
    }
}
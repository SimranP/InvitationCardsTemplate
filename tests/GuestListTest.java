import org.junit.Test;
import static org.junit.Assert.*;

public class GuestListTest {
     Person person =  new Person(new String[]{"Jaclyn", "Bartoletti", "Male", "22", "Veda haven", "North Carolina", "Macedonia"});
     Person person1 =  new Person(new String[]{"Melody","Dooley","Female","31","West Shanna","Vermont","Macedonia"});
    @Test
    public void add_method_adds_a_person_into_the_guestList_according_to_the_country_person_belongs_to() throws Exception {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        assertEquals(1,queenParty.size());
    }

    @Test
    public void listGuestsFromWithCountry_list_the_guests_from_a_specific_country() throws Exception {
        GuestList queenParty = new GuestList();
        queenParty.add(person);
        queenParty.add(person1);
        assertEquals("Mr Jaclyn Bartoletti, Macedonia\nMs Melody Dooley, Macedonia",queenParty.listGuestswithCountry("Macedonia"));
    }
}
package runner;

import option.FirstLast;
import org.junit.Test;
import validators.AgeFilter;
import validators.CountryFilter;
import validators.Validator;

import java.util.HashSet;

import static org.junit.Assert.*;

public class ArgumentParserTest {

    @Test
    public void fileName_gives_fileName() throws Exception {
        ArgumentParser args = new ArgumentParser(new String[]{"firstLast", "records"});
        assertEquals(args.fileName(),"records");
    }

    @Test
    public void filters() throws Exception {
        ArgumentParser args = new ArgumentParser(new String[]{"firstLast","--age:13","records"});
        HashSet<Validator> expectedFilters = new HashSet<Validator>();
        expectedFilters.add(new AgeFilter(13));
        assertEquals(args.filters(),expectedFilters);
    }

    @Test
    public void filters_gives_two_filters_when_there_is_age_and_country_options() throws Exception {
        ArgumentParser args = new ArgumentParser(new String[]{"firstLast","--age:13","--country:Bangladesh","records"});
        HashSet<Validator> expectedFilters = new HashSet<Validator>();
        expectedFilters.add(new AgeFilter(13));
        expectedFilters.add(new CountryFilter("Bangladesh"));
        assertEquals(args.filters(),expectedFilters);
    }


    @Test
    public void option() throws Exception {
        ArgumentParser args = new ArgumentParser(new String[]{"firstLast","--age:13","records"});
        assertEquals(args.option().getClass(),new FirstLast().getClass());
    }

    @Test(expected = RuntimeException.class)
    public void option_throw_invalid_option_exception_if_given_option_is_invalid() throws Exception {
        ArgumentParser args = new ArgumentParser(new String[]{"withFatherName","--age:13","records"});
        assertEquals(args.option().getClass(),new FirstLast().getClass());
    }
}
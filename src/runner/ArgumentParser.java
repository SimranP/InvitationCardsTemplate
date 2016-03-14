package runner;

import option.Option;
import validators.AgeFilter;
import validators.CountryFilter;
import validators.Validator;

import java.util.HashSet;

public class ArgumentParser {

    private String[] args;

    public ArgumentParser(String[] array) {
        args = array;
    }

    public String fileName() {
        return args[args.length-1];
    }

    public HashSet<Validator> filters(){
        HashSet<Validator> filters = new HashSet<Validator>();
        for (String arg : args) {
            if(arg.contains("--age:"))
                filters.add(new AgeFilter(Integer.parseInt(arg.split(":")[1])));
            if(arg.contains("--country:"))
                filters.add(new CountryFilter(arg.split(":")[1]));
        }
        return filters;
    }

    public Option option() throws RuntimeException{
        LabelChoices labelChoices = new LabelChoices();
         Option option=labelChoices.choices.get(args[0]);
        if(option==null)
            throw new RuntimeException("Invalid option...");
        return  option;
    }
}

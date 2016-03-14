package option;

import person.InformalFormat;
import person.Person;
import person.Label;

import java.util.Arrays;

public class PeopleAsLastFirstWithAddress implements option.Option {
    @Override
    public String createLabel(Person person) {
        return decorate(person.formatName(new InformalFormat()),person.address());
    }

    public static String decorate(Label upper, Label lower){
        String cityState = lower.toString().split("\n")[0];
        String country = lower.toString().split("\n")[1];
        int size = Math.max(Math.max(cityState.length(),country.length()),upper.toString().length());
        String[] dashes = new String[size];
        Arrays.fill(dashes,"-");
        String border = "+-"+String.join("",dashes)+"-+";
        String lineSeparator = "-"+String.join("",dashes)+"-";
        String name = upper+spaces(size-upper.toString().length()+1);
        country = country+spaces(size-country.length()+1);
        cityState = cityState+spaces(size-cityState.length()+1);
        return String.format("%s\n| %s |\n|%s|\n| %s |\n| %s |\n%s",border,name,lineSeparator,cityState,country,border);
    }

    private static String spaces(int length) {
        if(length<0) return "";
        String[] array = new String[length];
        Arrays.fill(array,"");
        return String.join(" ",array);
    }
}

package runner;

import option.*;
import person.Person;

import java.util.HashMap;

public class LabelChoices {
    public final HashMap<String, Option> choices;

    public LabelChoices() {
        choices = new HashMap<String, Option>();
        initializeChoices();
    }

    private void initializeChoices() {
        choices.put("firstLast", new FirstLast());
        choices.put("lastFirst", new LastFirst());
        choices.put("firstLastWithCountry", new PeopleAsFirstLastWithCountry());
        choices.put("lastFirstWithCountry", new PeopleAsLastFirstWithCountry());
        choices.put("peopleAsFirstLastAboveAgeInCountry", new PeopleAsFirstLastAboveAgeInCountry());
        choices.put("peopleAsLastFirstAboveAgeInCountry", new PeopleAsLastFirstAboveAgeInCountry());
        choices.put("peopleAsLastFirstWithAge",  new PeopleAsLastFirstAboveAge());
        choices.put("peopleAsFirstLastWithAge",  new PeopleAsFirstLastAboveAge());
        choices.put("formalFinalFormat", new PeopleAsFirstLastWithAddress());
        choices.put("informalFinalFormat", new PeopleAsLastFirstWithAddress());
    }
}

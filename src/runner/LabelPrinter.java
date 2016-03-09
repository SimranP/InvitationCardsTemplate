package runner;

import person.*;

import java.io.*;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
        File file = new File(args[1]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        GuestList guests = new GuestList();
        String line;
        while ((line = reader.readLine())!= null){
            Person person = createPerson(line.split(","));
            guests.add(person);
        }
        System.out.println(guests.printLabels(args[0]));
    }

    private static Person createPerson(String[] details) {
        Gender gender = details[2].equals("Male")?Gender.MALE:Gender.FEMALE;
        return new Person(new Name(details[0],details[1]),new Age(Integer.parseInt(details[3])),new Address(new City(details[4]), new State(details[5]), new Country(details[6])),gender);
    }
}
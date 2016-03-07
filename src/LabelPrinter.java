import java.io.*;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
        File file = new File(args[1]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        GuestList guests = new GuestList();
        String line;
        while ((line = reader.readLine())!= null){
            Person person = new Person(line.split(","));
            guests.add(person);
        }
    }
}

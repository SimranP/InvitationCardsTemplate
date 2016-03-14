package runner;

import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LabelPrinter {

    public static void main(String[] args) throws IOException ,RuntimeException{
        ArgumentParser arguments = new ArgumentParser(args);
        GuestList guests = readGuestList(arguments.fileName());
        guests = guests.applyFilters(arguments.filters());
        System.out.println(guests.generateLabels(arguments.option()));
    }

    private static GuestList readGuestList(String fileName) throws IOException , FileSystemNotFoundException{
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        return GuestList.parse(new String(bytes));
    }
}
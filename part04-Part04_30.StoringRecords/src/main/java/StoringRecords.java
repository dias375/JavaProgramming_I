
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        try (Scanner txtFile = new Scanner(Paths.get(file))) {
            while (txtFile.hasNextLine()) {
                String text = txtFile.nextLine();
                String[] txtPieces = text.split(",");

                String personName = txtPieces[0];
                int personAge = Integer.valueOf(txtPieces[1]);

                Person person = new Person(personName, personAge);
                persons.add(person);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // and printing the read records
        return persons;

    }
}

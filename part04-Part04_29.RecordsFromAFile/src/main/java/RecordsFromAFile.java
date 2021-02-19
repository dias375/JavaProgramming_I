
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {

            while (file.hasNextLine()) {

                String line = file.nextLine();
                String[] pieces = line.split(",");

                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);

                String years = "years";
                if (age == 1) {
                    years = "year";
                }

                System.out.println(name + ", age: " + age + " " + years);

            }

        }

    }
}

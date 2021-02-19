
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) throws IOException {

        try (Scanner scan = new Scanner(Paths.get("data.txt"))) {

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);

            }
        }

    }
}

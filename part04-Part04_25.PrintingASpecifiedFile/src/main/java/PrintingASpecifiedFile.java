
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String name = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(name))) {

            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
        }

    }
}

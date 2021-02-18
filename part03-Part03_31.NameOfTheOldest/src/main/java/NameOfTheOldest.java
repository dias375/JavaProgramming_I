
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
        int age = 0;
        String name = "";

        do {
            text = scanner.nextLine();

            if (!text.equals("")) {
                String[] pieces = text.split(",");

                int current = Integer.valueOf(pieces[1]);

                if (current > age) {
                    age = current;
                    name = pieces[0];
                }
            }

        } while (!text.equals(""));

        System.out.println("Name of the oldest: " + name);

    }
}

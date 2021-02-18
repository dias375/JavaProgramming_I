
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";

        do {
            text = scanner.nextLine();

            if (!text.equals("")) {
                String[] pieces = text.split(" ");
                System.out.println(pieces[pieces.length - 1]);
            }

        } while (!text.equals(""));

    }
}

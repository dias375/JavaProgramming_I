
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
        int age = 0;

        do {
            text = scanner.nextLine();

            if (!text.equals("")) {
                String[] pieces = text.split(",");

                int current = Integer.valueOf(pieces[1]);

                if (current > age) {
                    age = current;
                }
            }

        } while (!text.equals(""));
        
        System.out.println("Age of the oldest: " + age);

    }
}

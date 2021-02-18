
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
        int longName = 0;
        String name = "";
        int sum = 0;
        int times = 0;

        do {
            text = scanner.nextLine();

            if (!text.equals("")) {
                String[] pieces = text.split(",");

                int current = Integer.valueOf(pieces[0].length());

                if (current > longName) {
                    longName = current;
                    name = pieces[0];
                }
                
                sum += Integer.valueOf(pieces[1]);
                times++;
            }

        } while (!text.equals(""));

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0*sum/times));

    }
}

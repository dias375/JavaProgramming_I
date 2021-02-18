
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
        do {
            text = "";
            text = scanner.nextLine();

            if (!text.equals("")) {
                String[] split = text.split(" ");

                for (int i = 0; i < split.length; i++) {
                    if (split[i].contains("av")) {
                        System.out.println(split[i]);
                    }
                }
            }
        } while (!text.equals(""));

    }
}

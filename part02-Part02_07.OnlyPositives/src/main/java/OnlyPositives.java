
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if (a < 0) {
                System.out.println("Unsuitable number");
            } else if (a > 0) {
                System.out.println(a * a);
            } else {
                break;
            }
        }

    }
}

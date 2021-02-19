
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here

        Timer runTimer = new Timer();
        while (true) {
            runTimer.advance();
            System.out.println(runTimer.toString());
        }

    }
}

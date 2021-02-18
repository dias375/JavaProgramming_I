
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a;
        String b = "Caput Draconis";
        System.out.println("Password?");
        a = scan.nextLine();
        if (a.equals(b)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

        // Write your program here 
    }
}

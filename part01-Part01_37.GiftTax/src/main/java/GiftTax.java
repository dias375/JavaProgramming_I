
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int a = Integer.valueOf(scan.nextLine());
        int fix; // fixed tax
        double var; // variable tax
        double tax; // compound tax
        String ttax = "Tax: "; // tax to sout + value
        if (a < 5000) {
            System.out.println("No tax!");
        } else if (a < 25000) {
            fix = 100;
            var = ((a - 5000) * 0.08);
            tax = fix + var;
            System.out.println(ttax + tax);
        } else if (a < 55000) {
            fix = 1700;
            var = ((a - 25000) * 0.10);
            tax = fix + var;
            System.out.println(ttax + tax);
        } else if (a < 200000) {
            fix = 4700;
            var = ((a - 55000) * 0.12);
            tax = fix + var;
            System.out.println(ttax + tax);
        } else if (a < 1000000) {
            fix = 22100;
            var = ((a - 200000) * 0.15);
            tax = fix + var;
            System.out.println(ttax + tax);
        } else if (a >= 1000000) {
            fix = 142100;
            var = ((a - 1000000) * 0.17);
            tax = fix + var;
            System.out.println(ttax + tax);
        }

    }
}


import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int a = Integer.valueOf(scan.nextLine());
        String b;
        if (a < 0) {
            b = "impossible!";
        } else if (a < 50) {
            b = "failed";
        } else if (a < 60) {
            b = "1";
        } else if (a < 70) {
            b = "2";
        } else if (a < 80) {
            b = "3";
        } else if (a < 90) {
            b = "4";
        } else if (a <= 100) {
            b = "5";
        } else {
            b = "incredible!";
        }
        System.out.println("Grade: " + b);
    }
}

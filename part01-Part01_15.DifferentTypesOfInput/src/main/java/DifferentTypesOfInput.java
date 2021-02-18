
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String str = scan.nextLine();
System.out.println("Give an integer:");
int a = Integer.valueOf(scan.nextLine());
System.out.println("Give a double:");
double b = Double.valueOf(scan.nextLine());
System.out.println("Give a boolean:");
boolean c = Boolean.valueOf(scan.nextLine());
System.out.println("You gave the string " + str);
System.out.println("You gave the integer " + a);
System.out.println("You gave the double " + b);
System.out.println("You gave the boolean " + c);

        // Write your program here

    }
}

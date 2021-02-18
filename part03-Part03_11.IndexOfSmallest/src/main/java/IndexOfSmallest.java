
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 9999) {
                break;
            }
            list.add(value);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int menor = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < menor) {
                menor = list.get(i);
            }
        }
        System.out.println("Smallest number: " + menor);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == menor) {
                System.out.println("Found at index: " + i);
            }

        }
    }
}


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numberOfNumbers = 0;
        try (Scanner numbers = new Scanner(Paths.get(file))) {
            while (numbers.hasNextLine()) {
                int number = Integer.valueOf(numbers.nextLine());

                if (number >= lowerBound && number <= upperBound) {
                    numberOfNumbers++;
                }
            }
        }
        System.out.println("Numbers: " + numberOfNumbers);

    }

}

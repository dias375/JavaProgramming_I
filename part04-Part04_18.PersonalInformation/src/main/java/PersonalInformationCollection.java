
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Identification number: ");
            String id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, id));

        }

        for (PersonalInformation info : infoCollection) {
            String firstName;
            firstName = String.valueOf(info.getFirstName());
            String lastName;
            lastName = String.valueOf(info.getLastName());
            System.out.println(firstName + " " + lastName);
        }

    }
}

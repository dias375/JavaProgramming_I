
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(id, name);

            items.add(item);

        }
        System.out.println("==Items==");

        ArrayList<String> printedItemsId = new ArrayList();
        for (Item item : items) {
            boolean newId = true;
            for (String id : printedItemsId) {
                if (id.equals(item.getId())) {
                    newId = false;
                }
            }
            if (newId) {
                System.out.println(item);
                printedItemsId.add(item.getId());
            }

        }

    }
}

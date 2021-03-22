
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class TextUI {

    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String userInput = scan.nextLine();

            if (userInput.equals("end")) {
                System.out.println("Bye bye!");
                return;
            }
            if (userInput.equals("add")) {
                this.addWord();
            } else if (userInput.equals("search")) {
                this.searchWord();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    private void addWord() {
        System.out.println("Word:");
        String word = scan.nextLine();
        System.out.println("Translation:");
        String translation = scan.nextLine();
        this.dictionary.add(word, translation);
    }

    private void searchWord() {
        System.out.println("To be translated:");
        String word = scan.nextLine();
        String translation = this.dictionary.translate(word);
        if (translation == null) {
            System.out.println("Word " + word + " was not found.");
        } else {
            System.out.println(translation);
        }
    }

}

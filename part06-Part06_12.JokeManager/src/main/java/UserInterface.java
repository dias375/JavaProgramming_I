
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
public class UserInterface {

    private JokeManager jokes;
    private Scanner scan;

    public UserInterface(JokeManager jokes, Scanner scan) {
        this.jokes = jokes;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            String command = this.scanNextLine(this.menu());
            if (command.equals("X")) {
                return;
            } else if (command.equals("1")) {
                this.addJoke();
            } else if (command.equals("2")) {
                this.drawJoke();
            } else if (command.equals("3")) {
                this.listJokes();
            }
        }
    }

    private String menu() {
        String menu = "";
        menu += "Commands:\n";
        menu += " 1 - add a joke\n";
        menu += " 2 - draw a joke\n";
        menu += " 3 - list jokes\n";
        menu += " X - stop\n";
        return menu;
    }

    private String scanNextLine(String displayToUser) {
        System.out.println(displayToUser);
        String userInput = scan.nextLine();
        return userInput;
    }

    private void addJoke() {
        String joke = this.scanNextLine("Write the joke to be added:");
        this.jokes.addJoke(joke);
    }

    private void drawJoke() {
        String jokeDrawn = this.jokes.drawJoke();
        System.out.println(jokeDrawn);
    }

    private void listJokes() {
        this.jokes.printJokes();
    }

}

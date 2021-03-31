
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

    private Scanner scanner;
    private BirdWatcher birdWatcher;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdWatcher = new BirdWatcher();
    }

    public void start() {
        while (true) {
            String userInput = readUserInput("?");
            if (userInput.equals("Add")) {
                addBird();
            }
            if (userInput.equals("Observation")) {
                addObservation();
            }
            if (userInput.equals("All")) {
                printAllBirds();
            }
            if (userInput.equals("One")) {
                printOneBird();
            }
            if (userInput.equals("Quit")) {
                return;
            }
        }
    }

    private String readUserInput(String toDisplay) {
        System.out.println(toDisplay);
        String userInput = scanner.nextLine();
        return userInput;
    }

    private void addBird() {
        String name = readUserInput("Name: ");
        String latinName = readUserInput("Name in Latin: ");
        this.birdWatcher.addBirdToObserve(name, latinName);
    }

    private void addObservation() {
        String name = readUserInput("Bird?");
        if (this.birdWatcher.hasBird(name)) {
            this.birdWatcher.addObservationTo(name);
        } else {
            System.out.println("Not a bird!");
        }
    }

    private void printAllBirds() {
        this.birdWatcher.printAllBirds();
    }

    private void printOneBird() {
        String name = readUserInput("Bird?");
        this.birdWatcher.printOneBird(name);
    }
}

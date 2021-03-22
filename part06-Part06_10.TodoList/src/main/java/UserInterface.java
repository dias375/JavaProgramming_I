
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

    private TodoList TodoList;
    private Scanner scan;

    public UserInterface(TodoList TodoList, Scanner scan) {
        this.TodoList = TodoList;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            String input = this.userInput("Command: ");
            if (input.equals("stop")) {
                return;
            } else if (input.equals("add")) {
                this.add();
            } else if (input.equals("list")) {
                this.list();
            } else if (input.equals("remove")) {
                this.remove();
            }
        }
    }

    private void add() {
        String task = this.userInput("To add: ");
        this.TodoList.add(task);
    }

    private void list() {
        this.TodoList.print();
    }

    private void remove() {
        int taskIndex = Integer.valueOf(this.userInput("Which one is removed?"));
        this.TodoList.remove(taskIndex);
    }

    private String userInput(String displayToUser) {
        System.out.println(displayToUser);
        String input = scan.nextLine();
        return input;
    }

}

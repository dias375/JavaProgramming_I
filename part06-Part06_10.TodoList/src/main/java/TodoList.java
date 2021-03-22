
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<String>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (String task : this.tasks) {
            System.out.println(this.tasks.indexOf(task) + 1 + ": " + task);
        }
    }

    public void remove(int number) {
        this.tasks.remove(number - 1);
    }

}

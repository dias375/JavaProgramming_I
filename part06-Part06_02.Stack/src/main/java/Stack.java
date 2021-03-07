
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
public class Stack {

    private ArrayList<String> stack = new ArrayList<>();

    public Stack() {
    }

    public void add(String value) {
        this.stack.add(0, value);
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        String topValue = this.stack.get(0);
        this.stack.remove(0);
        return topValue;
    }
}

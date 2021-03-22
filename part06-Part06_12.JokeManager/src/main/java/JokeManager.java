
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        int random = new Random().nextInt(this.jokes.size());

        return jokes.get(random);

    }

    public void printJokes() {
        System.out.println("Printing jokes:");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

}

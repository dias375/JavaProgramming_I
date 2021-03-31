
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
public class BirdWatcher {

    private ArrayList<Observation> birdsObserved;

    public BirdWatcher() {
        this.birdsObserved = new ArrayList<Observation>();
    }

    public void addBirdToObserve(String name, String latinName) {
        Observation newBirdToObserve = new Observation(name, latinName);
        this.birdsObserved.add(newBirdToObserve);
    }

    public void addObservationTo(String name) {
        for (Observation bird : this.birdsObserved) {
            if (name.equals(bird.getName())) {
                bird.addObservation();
            }
        }
    }

    public boolean hasBird(String name) {
        for (Observation bird : this.birdsObserved) {
            if (name.equals(bird.getName())) {
                return true;
            }
        }
        return false;
    }

    public void printAllBirds() {
        for (Observation bird : this.birdsObserved) {
            System.out.println(bird.toString());
        }
    }

    public void printOneBird(String name) {
        for (Observation bird : this.birdsObserved) {
            if (name.equals(bird.getName())) {
                System.out.println(bird.toString());
                return;
            }
        }
    }

}

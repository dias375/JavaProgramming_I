/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgd
 */
public class Observation {

    private Bird bird;
    private int observations;

    public Observation() {
        this.observations = 0;
    }

    public Observation(String name, String latinName) {
        this.bird = new Bird(name, latinName);
        this.observations = 0;
    }

    public void addObservation() {
        this.observations++;
    }

    public int getObservations() {
        return this.observations;
    }

    public String getName() {
        return this.bird.getName();
    }

    public String toString() {
        return (this.bird + ": " + this.observations + " observations");
    }

}

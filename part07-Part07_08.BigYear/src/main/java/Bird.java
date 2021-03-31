/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgd
 */
public class Bird {

    private String name;
    private String latinName;

    public Bird() {
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public void addName(String name) {
        this.name = name;
    }

    public void addLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public String toString() {
        return (this.name + " (" + this.latinName + ")");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgd
 */
public class Cube {

    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        int cubeVolume = this.edgeLength * this.edgeLength * this.edgeLength;
        return cubeVolume;
    }

    public String toString() {
        String start = "The length of the edge is ";
        String mid = " and the volume ";
        return (start + this.edgeLength + mid + this.volume());
    }

}


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
public class Hold {

    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcasesOnHold;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.suitcasesOnHold = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.currentWeight <= this.maxWeight) {
            this.suitcasesOnHold.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public String toString() {
        return this.suitcasesOnHold.size() + " suitcases (" + this.currentWeight + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : this.suitcasesOnHold) {
            suitcase.printItems();
        }
    }

}

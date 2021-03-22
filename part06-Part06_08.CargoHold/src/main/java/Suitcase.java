
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
public class Suitcase {

    private int weightLimit;
    private ArrayList<Item> itemsInSuitcase;
    private int currentWeight;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.itemsInSuitcase = new ArrayList<Item>();
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= this.weightLimit) {
            this.itemsInSuitcase.add(item);
            this.currentWeight += item.getWeight();
        }
    }

    public String toString() {
        if (this.itemsInSuitcase.isEmpty()) {
            return "no items (0 kg)";
        }

        String item = "item";

        if (this.itemsInSuitcase.size() > 1) {
            item += "s";
        }

        int howMany = this.itemsInSuitcase.size();

        return howMany + " " + item + " (" + this.currentWeight + " kg)";
    }

    public void printItems() {
        for (Item item : this.itemsInSuitcase) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if (this.itemsInSuitcase.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.itemsInSuitcase.get(0);
        for (Item item : this.itemsInSuitcase) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

}

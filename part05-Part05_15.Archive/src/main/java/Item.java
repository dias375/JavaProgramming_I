/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgd
 */
public class Item {

    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object compared) {

        Item comparedItem = (Item) compared;
        if (this.id.equals(comparedItem.getId())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return (this.id + ": " + this.name);
    }

}


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
public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String Name) {
        this.name = name;
        this.cookingTime = 0;
        this.ingredients = new ArrayList<String>();
    }

    public Recipe() {
        this.name = "voidName";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<String>();
    }

    public void addRecipeName(String name) {
        this.name = name;
    }

    public void addCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {
        String name = this.name;
        String cookingTime = "cooking time: " + this.cookingTime;
        return (name + ", " + cookingTime);
    }

}

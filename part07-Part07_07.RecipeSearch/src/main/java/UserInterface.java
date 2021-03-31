
import java.util.Scanner;
import java.io.File;
import java.nio.file.Paths;
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
public class UserInterface {

    Scanner scanner;
    ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<Recipe>();
    }

    public void start() {

        //Read file
        String fileName = userInput("File to read: ");
        readFile(fileName);

        //Run menu
        while (true) {
            printMenu();
            String command = userInput("Enter command: ");
            if (command.equals("stop")) {
                return;
            }
            if (command.equals("list")) {
                listRecipes();
            }
            if (command.equals("find name")) {
                findRecipe();
            }
            if (command.equals("find cooking time")) {
                findCookingTime();
            }
            if (command.equals("find ingredient")) {
                findIngredient();
            }

        }
    }

    private void readFile(String fileName) {

        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            // Parse file into ArrayList(line)
            ArrayList<String> fileArray = new ArrayList<String>();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                fileArray.add(line);
            }

            // Create a new recipe for each blank space into the ArrayList
            createRecipesObjects(fileArray);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addRecipeDetailsToObjects(ArrayList<String> fileArray) {
        int i = 0;
        int recipeObjectIndex = 0;
        for (String line : fileArray) {
            if (i == 0) {
                this.recipes.get(recipeObjectIndex).addRecipeName(line);
                i++;
            } else if (i == 1) {
                this.recipes.get(recipeObjectIndex).addCookingTime(Integer.valueOf(line));
                i++;
            } else if (line.equals("")) {//isBlank() not avaliable on this java version
                i = 0;
                recipeObjectIndex++;
            } else {
                this.recipes.get(recipeObjectIndex).addIngredient(line);
            }
        }
    }

    private void createRecipesObjects(ArrayList<String> fileArray) {
        if (fileArray.isEmpty()) {
            return;
        }
        this.recipes.add(new Recipe());
        for (String line : fileArray) {
            if (line.equals("")) {
                this.recipes.add(new Recipe());
            }
        }
        addRecipeDetailsToObjects(fileArray);
    }

    private String userInput(String textToDisplay) {
        System.out.println(textToDisplay);
        String input = scanner.nextLine();
        return input;
    }

    private void printMenu() {
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    private void listRecipes() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe.toString());
        }
    }

    private void findRecipe() {
        String recipeSearched = userInput("Searched word: ");
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(recipeSearched)) {
                System.out.println(recipe.toString());
            }
        }
    }

    private void findCookingTime() {
        int timeLimit = Integer.valueOf(userInput("Max cooking time: "));
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= timeLimit) {
                System.out.println(recipe.toString());
            }
        }
    }

    private void findIngredient() {
        String ingredientSearched = userInput("Ingredient: ");
        System.out.println("Recipes:");
        for (Recipe recipe : this.recipes) {
            ArrayList<String> ingredients = recipe.getIngredients();
            for (String ingredient : ingredients) {
                if (ingredient.equals(ingredientSearched)) {
                    System.out.println(recipe.toString());
                }
            }
        }
    }
}

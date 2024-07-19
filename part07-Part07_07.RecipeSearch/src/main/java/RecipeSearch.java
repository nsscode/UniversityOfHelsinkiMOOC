import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        // Ask user what file to read
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        // Reading the recipes from the file
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {

                // Read the name
                String name = fileScanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                // Read the duration
                int duration = Integer.valueOf(fileScanner.nextLine());

                // Read the ingredients and save them in an array
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                recipes.add(new Recipe(name, duration, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // List the commands
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");

            if (command.equals("list")) {
                listRecipes(recipes);

            } else if (command.equals("stop")) {
                break;

            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String name = scanner.nextLine();
                findName(recipes, name);

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time:");
                int maxDuration = Integer.valueOf(scanner.nextLine());
                findCookingTime(recipes, maxDuration);

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                findIngredient(recipes, ingredient);
            }
        }
    }

    private static void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    private static void findName(ArrayList<Recipe> recipes, String name) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    private static void findCookingTime(ArrayList<Recipe> recipes, int maxDuration) {
        for (Recipe recipe : recipes) {
            if (recipe.getDuration() <= maxDuration) {
                System.out.println(recipe);
            }
        }
    }

    private static void findIngredient(ArrayList<Recipe> recipes, String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

}
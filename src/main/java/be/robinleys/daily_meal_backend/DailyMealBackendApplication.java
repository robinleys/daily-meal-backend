package be.robinleys.daily_meal_backend;

import be.robinleys.daily_meal_backend.model.Ingredient;
import be.robinleys.daily_meal_backend.model.Recipe;
import be.robinleys.daily_meal_backend.repository.IngredientDAO;
import be.robinleys.daily_meal_backend.repository.RecipeDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DailyMealBackendApplication implements CommandLineRunner {
    private final RecipeDAO recipeDAO;
    private final IngredientDAO ingredientDAO;

    public DailyMealBackendApplication(RecipeDAO recipeDAO, IngredientDAO ingredientDAO) {
        this.recipeDAO = recipeDAO;
        this.ingredientDAO = ingredientDAO;
    }

    public void run(String... args) throws Exception {
//        ingredientDAO.create(new Ingredient("Chicken", 1, "unit"));
//        ingredientDAO.create(new Ingredient("Beef", 3, "unit"));
//        ingredientDAO.create(new Ingredient("Noodles", 2, "unit"));
//        ingredientDAO.create(new Ingredient("Paprika", 5, "unit"));
//        recipeDAO.create(new Recipe("Chicken paprika and noodles"));

        List<Ingredient> ingredients = ingredientDAO.findAll();
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient);
        }




//        recipeDAO.addIngredientToRecipe(1,1,1);
//        recipeDAO.addIngredientToRecipe(1,2,200);
//        recipeDAO.addIngredientToRecipe(1,3,400);

//        System.out.println(recipeDAO.getIngredientsForRecipe(1));
    }

    public static void main(String[] args) {
        SpringApplication.run(DailyMealBackendApplication.class, args);
    }

}

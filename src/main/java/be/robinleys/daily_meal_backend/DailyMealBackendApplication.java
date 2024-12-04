package be.robinleys.daily_meal_backend;

import be.robinleys.daily_meal_backend.repository.IngredientDAO;
import be.robinleys.daily_meal_backend.repository.RecipeDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyMealBackendApplication implements CommandLineRunner {
    private final RecipeDAO recipeDAO;
    private final IngredientDAO ingredientDAO;

    public DailyMealBackendApplication(RecipeDAO recipeDAO, IngredientDAO ingredientDAO) {
        this.recipeDAO = recipeDAO;
        this.ingredientDAO = ingredientDAO;
    }

    public void run(String... args) throws Exception {
        System.out.println(recipeDAO.findAll());
        System.out.println(ingredientDAO.findAll());
//        recipeDAO.addIngredientToRecipe(1,1,1);
//        recipeDAO.addIngredientToRecipe(1,2,200);
//        recipeDAO.addIngredientToRecipe(1,3,400);

        System.out.println(recipeDAO.getIngredientsForRecipe(1));
    }

    public static void main(String[] args) {
        SpringApplication.run(DailyMealBackendApplication.class, args);
    }

}

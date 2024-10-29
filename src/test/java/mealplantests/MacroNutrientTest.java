package mealplantests;

import com.concretefood.Food;
import com.foodfactory.FoodFactory;
import com.macronutrient.Macronutrient;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class MacroNutrientTest {

    @Test
    public void singletonTest() {
        Macronutrient macronutrientOne = Macronutrient.getInstance();
        Macronutrient macronutrientTwo = Macronutrient.getInstance();
        boolean sameInstance = macronutrientOne == macronutrientTwo;
        macronutrientTwo = null;
        Macronutrient macronutrientThree = Macronutrient.getInstance();
        boolean differentInstance = macronutrientThree != macronutrientTwo;
        assertTrue(sameInstance);
        assertTrue(differentInstance);
    }

    @Test
    public void selectRandomFoodTest() {
        Macronutrient macronutrient = Macronutrient.getInstance();
        FoodFactory foodFactory = FoodFactory.getInstance();

        ArrayList<String> foodCategories = macronutrient.getFoodCategories();
        boolean foodSetContainsFood = true;

        for (String category : foodCategories) {
            Food foods = foodFactory.getFood(category);
            HashSet<String> foodSet = foods.getFoodList();
            ArrayList<String> foodList = new ArrayList<>(foodSet);
            String randomFood = macronutrient.selectRandomItem(foodList);
            foodSetContainsFood = foodSet.contains(randomFood);
            if (!foodSetContainsFood) {
                break;
            }
        }
        assertTrue(foodSetContainsFood);
    }

    @Test
    public void inputValidationTest() {
        Macronutrient macronutrient = Macronutrient.getInstance();
        assertThrows(IllegalArgumentException.class, () -> macronutrient.createMeal(""));
    }

    @Test
    public void removeFoodsTest() {
        Macronutrient macronutrient = Macronutrient.getInstance();
        FoodFactory foodFactory = FoodFactory.getInstance();

        ArrayList<String> foodCategories = macronutrient.getFoodCategories();
        ArrayList<String> dietPlans = macronutrient.getDietPlans();

        boolean doesNotContainRestrictedFoods = true;

        outerLoop:
        for (String dietPlan : dietPlans) {
            Food restrictedFoods = foodFactory.getFood(dietPlan);
            HashSet<String> restrictedFoodSet = restrictedFoods.getFoodList();
            for (String foodCategory : foodCategories) {
                Food completeFoods = foodFactory.getFood(foodCategory);
                HashSet<String> completeFoodsSet = completeFoods.getFoodList();
                ArrayList<String> approvedFoodList = macronutrient.removeRestrictedFoods(completeFoodsSet, restrictedFoodSet);
                doesNotContainRestrictedFoods = checkIfRestrictedInApproved(restrictedFoodSet, approvedFoodList);
                if (!doesNotContainRestrictedFoods) {
                    break outerLoop;
                }
            }
        }
        assertTrue(doesNotContainRestrictedFoods);
    }

    public boolean checkIfRestrictedInApproved(HashSet<String> restrictedFoodSet, ArrayList<String> approvedFoodList) {
        for (String restrictedFood : restrictedFoodSet) {
            if (approvedFoodList.contains(restrictedFood)) {
                return false;
            }
        }
        return true;
    }

}

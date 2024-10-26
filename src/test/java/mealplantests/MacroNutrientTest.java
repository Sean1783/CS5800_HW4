package mealplantests;

import com.concretefood.Food;
import com.foodfactory.FoodFactory;
import com.macronutrient.Macronutrient;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MacroNutrientTest {

    @Test
    public void SingletonTest() {
        Macronutrient macronutrientOne = Macronutrient.getInstance();
        Macronutrient macronutrientTwo = Macronutrient.getInstance();
        assertEquals(macronutrientOne, macronutrientTwo);
    }

    @Test
    public void SelectRandomFoodTest() {
        Macronutrient macronutrient = Macronutrient.getInstance();
        FoodFactory foodFactory = FoodFactory.getInstance();
        Food foods = foodFactory.getFood("Carb");
        HashSet<String> foodSet = foods.getFoodList();
        ArrayList<String> foodList = new ArrayList<>(foodSet);
        String randomFood = macronutrient.selectRandomItem(foodList);
        assertTrue(foodSet.contains(randomFood));
    }

    @Test
    public void RemoveFoodsTest() {
        Macronutrient macronutrient = Macronutrient.getInstance();
        FoodFactory foodFactory = FoodFactory.getInstance();
        Food foods = foodFactory.getFood("Carb");
        HashSet<String> foodSet = foods.getFoodList();
        Food restrictedFoods = foodFactory.getFood("Paleo");
        HashSet<String> restrictedFoodSet = restrictedFoods.getFoodList();
        ArrayList<String> approvedFoodList = macronutrient.removeRestrictedFoods(foodSet, restrictedFoodSet);
        boolean doesNotContainRestrictedFoods = true;
        for (String restrictedFood : restrictedFoodSet) {
            if (approvedFoodList.contains(restrictedFood)) {
                doesNotContainRestrictedFoods = false;
                break;
            }
        }
        assertTrue(doesNotContainRestrictedFoods);
    }
}

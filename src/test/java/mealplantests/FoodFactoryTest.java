package mealplantests;

import static org.junit.jupiter.api.Assertions.*;

import com.concretefood.Food;
import com.foodfactory.FoodFactory;
import com.macronutrient.Macronutrient;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FoodFactoryTest {

    @Test
    public void singletonTest() {
        FoodFactory foodFactoryOne = FoodFactory.getInstance();
        FoodFactory foodFactoryTwo = FoodFactory.getInstance();
        boolean sameInstance = foodFactoryOne == foodFactoryTwo;

        foodFactoryTwo = null;
        FoodFactory foodFactoryThree = FoodFactory.getInstance();
        boolean differentInstance = foodFactoryThree != foodFactoryTwo;

        assertTrue(sameInstance);
        assertTrue(differentInstance);
    }

    @Test
    public void getFoodTest() {
        FoodFactory foodFactory = FoodFactory.getInstance();
        Macronutrient macronutrient = Macronutrient.getInstance();

        ArrayList<String> foodCategories = macronutrient.getFoodCategories();
        ArrayList<String> dietPlans = macronutrient.getDietPlans();
        foodCategories.addAll(dietPlans);

        boolean foodIsNotNull = true;
        boolean correctCategory = true;
        for (String foodCategory : foodCategories) {
            Food food = foodFactory.getFood(foodCategory);
            if (food == null) {
                foodIsNotNull = false;
                break;
            }
            if (!food.name.equals(foodCategory)) {
                correctCategory = false;
                break;
            }
        }
        Food notFood = foodFactory.getFood("");

        assertTrue(foodIsNotNull);
        assertNull(notFood);
        assertTrue(correctCategory);
    }


}

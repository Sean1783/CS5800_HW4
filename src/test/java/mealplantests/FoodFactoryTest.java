package mealplantests;

import static org.junit.jupiter.api.Assertions.*;

import com.concretefood.Food;
import com.foodfactory.FoodFactory;
import org.junit.jupiter.api.Test;

public class FoodFactoryTest {

    @Test
    public void SingletonTest() {
        FoodFactory foodFactoryOne = FoodFactory.getInstance();
        FoodFactory foodFactoryTwo = FoodFactory.getInstance();
        assertEquals(foodFactoryOne, foodFactoryTwo);
    }

    @Test
    public void getFoodTest() {
        FoodFactory foodFactoryOne = FoodFactory.getInstance();
        Food notFood = foodFactoryOne.getFood("");
        assertNull(notFood);
    }
}

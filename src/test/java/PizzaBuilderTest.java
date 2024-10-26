import com.pizza.Pizza;
import com.pizza.PizzaBuilder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class PizzaBuilderTest {

    @Test
    public void createObjectTest() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("Large");
        Pizza pizza = pizzaBuilder.build();
        assertNotNull(pizza);
    }

    @Test
    public void validSizeTest() {
        assertDoesNotThrow(() -> {new PizzaBuilder("Large");});
        assertDoesNotThrow(() -> {new PizzaBuilder("Medium");});
        assertDoesNotThrow(() -> {new PizzaBuilder("Small");});
    }

    @Test
    public void invalidSizeTest() {
        assertThrows(IllegalArgumentException.class, () -> {new PizzaBuilder("arge");});
        assertThrows(IllegalArgumentException.class, () -> {new PizzaBuilder("");});
        assertThrows(IllegalArgumentException.class, () -> {new PizzaBuilder("small");});
    }

    @Test
    public void toppingsTest() {
        Pizza pizza = new PizzaBuilder("Small")
                .withPepperoni()
                .withSausage()
                .withMushrooms()
                .withBacon()
                .withOnions()
                .withExtraCheese()
                .withPeppers()
                .withChicken()
                .withOlives()
                .withSpinach()
                .withTomatoAndBasil()
                .withBeef()
                .withHam()
                .withPesto()
                .withSpicyPork()
                .withHamAndPineapple()
                .build();

        Set<String> toppings = new HashSet<String>(Arrays.asList(
                "Extra Cheese",
                "Pepperoni",
                "Sausage",
                "Mushrooms",
                "Bacon",
                "Onions",
                "Peppers",
                "Chicken",
                "Olives",
                "Spinach",
                "Tomato and Basil",
                "Beef",
                "Ham",
                "Pesto",
                "Spicy Pork",
                "Ham and Pineapple"
        ));
        List<String> pizzaToppings = pizza.getToppings();
        boolean containsAllToppings = true;
        for (String topping : pizzaToppings) {
            if (!toppings.contains(topping)) {
                containsAllToppings = false;
                break;
            }
        }
        assertTrue(containsAllToppings);
    }

    @Test
    public void chainedToppingsTest() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("Medium");
        int numberOfChainedCalls = 100;
        for (int i = 0; i < numberOfChainedCalls; i++) {
            pizzaBuilder.withBeef();
        }
        List<String> toppingsList = pizzaBuilder.getToppings();
        int toppingsCount = 0;
        for (String topping : toppingsList) {
            if (topping.equals("Beef")) {
                toppingsCount++;
            }
        }
        boolean isCorrectCount = numberOfChainedCalls == toppingsCount;
        assertTrue(isCorrectCount);
    }

}

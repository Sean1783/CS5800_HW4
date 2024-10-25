import com.pizza.Pizza;
import com.pizza.PizzaBuilder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

public class PizzaBuilderTest {

    @Test
    public void createObjectTest() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("Large");
        Pizza pizza = pizzaBuilder.build();
        assertNotNull(pizza);
    }

    @Test
    public void correctSizeTest() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("Large");
        String pizzaSize = pizzaBuilder.getSize();
        boolean pizzaBuilderSize = Objects.equals(pizzaSize, "Large");
        assertTrue(pizzaBuilderSize);
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
        assertThrows(IllegalArgumentException.class, () -> {new PizzaBuilder("mdium");});
        assertThrows(IllegalArgumentException.class, () -> {new PizzaBuilder("small");});
    }

    @Test
    public void hasPepperoniTest() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder("Small");
        pizzaBuilder.withPepperoni();
        List<String> toppingsList = pizzaBuilder.getToppings();
        boolean hasPepperoni = toppingsList.contains("Pepperoni");
        assertTrue(hasPepperoni);
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

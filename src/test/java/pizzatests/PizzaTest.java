package pizzatests;

import com.pizza.Pizza;
import com.pizza.PizzaBuilder;
import com.pizza.PizzaChain;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import java.util.List;

public class PizzaTest {

    @Test
    public void getToppingsTest() {
        Pizza pizza = new PizzaBuilder("Small")
                .withPepperoni()
                .withHam()
                .withMushrooms()
                .build();
        boolean emptyToppings = pizza.getToppings().isEmpty();
        assertFalse(emptyToppings);
    }

    @Test
    public void setChainTest() {
        String chainName = "Test Chain";
        PizzaChain chain = new PizzaChain(chainName);
        Pizza pizza = new PizzaBuilder("Small").build();
        chain.addPizza(pizza);
        assertEquals(pizza.getChain(), chainName);
    }

    @Test
    public void unsetChainTest() {
        String chainName = "Test Chain";
        PizzaChain chain = new PizzaChain(chainName);
        Pizza pizzaOne = new PizzaBuilder("Small").build();
        chain.addPizza(pizzaOne);
        chain.removePizza(pizzaOne);
        assertNotEquals(pizzaOne.getChain(), chainName);
    }

    @Test
    public void toppingsCopyTest() {
        Pizza pizza = new PizzaBuilder("Small")
                .withPepperoni()
                .withHam()
                .withMushrooms()
                .build();

        List<String> toppingOriginal = pizza.getToppings();
        List<String> toppingsCopy = pizza.getToppings();
        toppingsCopy.add("Fake topping");
        boolean toppingsShouldBeDifferent = false;
        for (String topping : toppingsCopy) {
            if (!toppingOriginal.contains(topping)) {
                toppingsShouldBeDifferent = true;
                break;
            }
        }
        assertTrue(toppingsShouldBeDifferent);
    }


}

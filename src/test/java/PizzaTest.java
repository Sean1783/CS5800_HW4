import static org.junit.jupiter.api.Assertions.*;

import com.pizza.Pizza;
import com.pizza.PizzaBuilder;
import com.pizza.PizzaChain;

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

    public void setChainTest() {
        String chainName = "Test Chain";
        PizzaChain chain = new PizzaChain(chainName);
        Pizza pizza = new PizzaBuilder("Small").build();
        chain.addPizza(pizza);
        assertEquals(pizza.getChain(), chainName);
    }

    public void unsetChainTest() {
        String chainName = "Test Chain";
        PizzaChain chain = new PizzaChain(chainName);
        Pizza pizza = new PizzaBuilder("Small").build();
        chain.removePizza(pizza);
        assertNotEquals(pizza.getChain(), chainName);
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

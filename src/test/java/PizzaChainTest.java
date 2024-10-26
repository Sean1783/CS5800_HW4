import com.pizza.Pizza;
import com.pizza.PizzaBuilder;
import com.pizza.PizzaChain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PizzaChainTest {

    @Test
    public void createPizzaChainTest() {
        PizzaChain chain = new PizzaChain("Test Chain");
        assertNotNull(chain);
    }

    @Test
    public void addNewPizzaTest() {
        Pizza pizza = new PizzaBuilder("Small").build();
        PizzaChain chain = new PizzaChain("Test Chain");
        assertTrue(chain.addPizza(pizza));
    }

    @Test
    public void removePizzaTest() {
        Pizza pizza = new PizzaBuilder("Small").build();
        PizzaChain chain = new PizzaChain("Test Chain");
        chain.addPizza(pizza);
        assertTrue(chain.removePizza(pizza));
    }

    @Test
    public void clearPizzaListTest() {
        PizzaChain chain = new PizzaChain("Test Chain");
        for (int i = 0; i < 100; i++) {
            Pizza pizza = new PizzaBuilder("Small").build();
            chain.addPizza(pizza);
        }
        chain.clearPizzaList();
        assertNull(chain.getPizzas());
    }

    @Test
    public void pizzaListCopyTest() {
        Pizza pizza = new PizzaBuilder("Small").build();
        PizzaChain chain = new PizzaChain("Test Chain");
        chain.addPizza(pizza);
        ArrayList<Pizza> pizzas = chain.getPizzas();
        assertFalse(pizzas.contains(pizza));
    }
}

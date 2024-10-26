package pizzatests;

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
        assertFalse(chain.addPizza(pizza));
    }

    @Test
    public void removePizzaTest() {
        Pizza pizza = new PizzaBuilder("Small").build();
        PizzaChain chain = new PizzaChain("Test Chain");
        chain.addPizza(pizza);
        assertTrue(chain.removePizza(pizza));
        assertFalse(chain.removePizza(pizza));
    }

    @Test
    public void clearPizzaListTest() {
        PizzaChain chain = new PizzaChain("Test Chain");
        for (int i = 0; i < 100; i++) {
            Pizza pizza = new PizzaBuilder("Small").build();
            chain.addPizza(pizza);
        }
        chain.clearPizzaList();
        assertTrue(chain.getPizzas().isEmpty());
    }

    @Test
    public void pizzaListCopyTest() {
        Pizza pizza = new PizzaBuilder("Small").build();
        PizzaChain chain = new PizzaChain("Test Chain");
        chain.addPizza(pizza);
        ArrayList<Pizza> copiedPizzaList = chain.getPizzas();
        assertFalse(copiedPizzaList.contains(pizza));
    }
}

import static org.junit.jupiter.api.Assertions.*;

import com.pizza.Pizza;
import com.pizza.PizzaBuilder;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    @Test
    public void pizzaTest() {
        Pizza pizza = new PizzaBuilder("Small")
                .withPepperoni()
                .withHam()
                .withMushrooms()
                .build();

        boolean emptyToppings = pizza.getToppings().isEmpty();
        assertFalse(emptyToppings);
    }
}

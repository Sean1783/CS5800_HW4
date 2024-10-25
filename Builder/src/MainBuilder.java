import com.pizza.Pizza;
import com.pizza.PizzaBuilder;
import com.pizza.PizzaChain;

public class MainBuilder {
    public static void main(String[] args) {

        PizzaChain pizzaHut = new PizzaChain("Pizza Hut");
        Pizza smallThreeTopping = new PizzaBuilder("Small")
                .withHam()
                .withChicken()
                .withBeef()
                .build();
        pizzaHut.addPizza(smallThreeTopping);

        Pizza mediumSixTopping = new PizzaBuilder("Medium")
                .withPepperoni()
                .withMushrooms()
                .withOnions()
                .withPeppers()
                .withBeef()
                .withSausage()
                .build();
        pizzaHut.addPizza(mediumSixTopping);

        Pizza largeNineTopping = new PizzaBuilder("Large")
                .withOlives()
                .withBeef()
                .withChicken()
                .withHam()
                .withOnions()
                .withPepperoni()
                .withSpicyPork()
                .withHam()
                .withPesto()
                .build();
        pizzaHut.addPizza(largeNineTopping);
        pizzaHut.dump();
        pizzaHut.clearPizzaList();

        Pizza largeThreeTopping = new PizzaBuilder("Large")
                .withPepperoni()
                .withOnions()
                .withMushrooms()
                .build();
        pizzaHut.addPizza(largeThreeTopping);

        Pizza smallTwoTopping = new PizzaBuilder("Small")
                .withTomatoAndBasil()
                .withPeppers()
                .build();
        pizzaHut.addPizza(smallTwoTopping);
        pizzaHut.dump();

        PizzaChain littleCaesars = new PizzaChain("Little Caesars");
        Pizza mediumEightTopping = new PizzaBuilder("Medium")
                .withBeef()
                .withHam()
                .withChicken()
                .withMushrooms()
                .withBacon()
                .withPeppers()
                .withPepperoni()
                .withSausage()
                .build();
        littleCaesars.addPizza(mediumEightTopping);

        Pizza smallSixTopping = new PizzaBuilder("Small")
                .withHamAndPineapple()
                .withPepperoni()
                .withExtraCheese()
                .build();
        littleCaesars.addPizza(smallSixTopping);
        littleCaesars.dump();

        PizzaChain dominos = new PizzaChain("Dominos");
        Pizza smallOneTopping = new PizzaBuilder("Small")
                .withExtraCheese()
                .build();
        dominos.addPizza(smallOneTopping);
        dominos.addPizza(largeThreeTopping);
        dominos.dump();

    }
}
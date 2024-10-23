import com.pizza.Pizza;
import com.pizza.PizzaBuilderInterface;
import com.pizzachain.PizzaChain;
import com.pizzachain.PizzaChainInterface;

public class Main {
    public static void main(String[] args) {

        Pizza smallThreeTopping = new Pizza.PizzaBuilder("Small")
                .withHam()
                .withChicken()
                .withBeef()
                .build();

        Pizza mediumSixTopping = new Pizza.PizzaBuilder("Medium")
                .withPepperoni()
                .withMushrooms()
                .withOnions()
                .withPeppers()
                .withBeef()
                .withSausage()
                .build();

        Pizza largeNineTopping = new Pizza.PizzaBuilder("Large")
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

        PizzaChain pizzaHut = new PizzaChain();
        pizzaHut.chainName = "Pizza Hut";
        pizzaHut.pizzas.add(smallThreeTopping);
        pizzaHut.pizzas.add(mediumSixTopping);
        pizzaHut.pizzas.add(largeNineTopping);
        pizzaHut.eat();

        Pizza largeThreeTopping = new Pizza.PizzaBuilder("Large")
                .withPepperoni()
                .withOnions()
                .withMushrooms()
                .build();

        Pizza smallTwoTopping = new Pizza.PizzaBuilder("Small")
                .withTomatoAndBasil()
                .withPeppers()
                .build();

        pizzaHut.pizzas.clear();
        pizzaHut.pizzas.add(largeThreeTopping);
        pizzaHut.pizzas.add(smallTwoTopping);
        pizzaHut.eat();

        Pizza mediumEightTopping = new Pizza.PizzaBuilder("Medium")
                .withBeef()
                .withHam()
                .withChicken()
                .withMushrooms()
                .withBacon()
                .withPeppers()
                .withPepperoni()
                .withSausage()
                .build();

        Pizza smallSixTopping = new Pizza.PizzaBuilder("Small")
                .withHamAndPineapple()
                .withPepperoni()
                .withExtraCheese()
                .build();

        PizzaChain littleCaesars = new PizzaChain();
        littleCaesars.chainName = "Little Caesars";
        littleCaesars.pizzas.add(mediumEightTopping);
        littleCaesars.pizzas.add(smallSixTopping);
        littleCaesars.eat();

        Pizza smallOneTopping = new Pizza.PizzaBuilder("Small")
                .withExtraCheese()
                .build();

        PizzaChain dominos = new PizzaChain();
        dominos.chainName = "Dominos";
        dominos.pizzas.add(largeThreeTopping);
        dominos.pizzas.add(smallOneTopping);
        dominos.eat();

    }
}
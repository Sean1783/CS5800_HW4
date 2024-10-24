import com.pizza.Pizza;
import com.pizza.PizzaBuilder;
import com.pizza.PizzaChain;

public class Main {
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
        pizzaHut.dump();
//
//        Pizza largeNineTopping = new PizzaBuilder("Large")
//                .withOlives()
//                .withBeef()
//                .withChicken()
//                .withHam()
//                .withOnions()
//                .withPepperoni()
//                .withSpicyPork()
//                .withHam()
//                .withPesto()
//                .build();
//
//        Pizza largeThreeTopping = new PizzaBuilder("Large")
//                .withPepperoni()
//                .withOnions()
//                .withMushrooms()
//                .build();
//
//        Pizza smallTwoTopping = new PizzaBuilder("Small")
//                .withTomatoAndBasil()
//                .withPeppers()
//                .build();
//
//        Pizza mediumEightTopping = new PizzaBuilder("Medium")
//                .withBeef()
//                .withHam()
//                .withChicken()
//                .withMushrooms()
//                .withBacon()
//                .withPeppers()
//                .withPepperoni()
//                .withSausage()
//                .build();
//
//        Pizza smallSixTopping = new PizzaBuilder("Small")
//                .withHamAndPineapple()
//                .withPepperoni()
//                .withExtraCheese()
//                .build();
//
        PizzaChain littleCaesars = new PizzaChain("Little Caesars");

        Pizza smallOneTopping = new PizzaBuilder("Small")
                .withExtraCheese()
                .build();

        littleCaesars.addPizza(smallOneTopping);
        littleCaesars.dump();
//
//        PizzaChain dominos = new PizzaChain();


    }
}
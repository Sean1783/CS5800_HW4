import com.macronutrient.Macronutrient;
import com.pizza.Pizza;
import com.pizza.PizzaBuilder;
import com.pizza.PizzaChain;

public class Main {
    public static void main(String[] args) {

        // Builder
        // Builder - #1
        PizzaChain pizzaHut = new PizzaChain("Pizza Hut");
        Pizza smallThreeTopping = new PizzaBuilder("Small")
                .withHam()
                .withChicken()
                .withBeef()
                .build();
        pizzaHut.addPizza(smallThreeTopping);
        System.out.println(smallThreeTopping.eat());

        Pizza mediumSixTopping = new PizzaBuilder("Medium")
                .withPepperoni()
                .withMushrooms()
                .withOnions()
                .withPeppers()
                .withBeef()
                .withSausage()
                .build();
        pizzaHut.addPizza(mediumSixTopping);
        System.out.println(mediumSixTopping.eat());

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
        System.out.println(largeNineTopping.eat());
        pizzaHut.clearPizzaList();

        // Builder - #2
        Pizza largeThreeTopping = new PizzaBuilder("Large")
                .withPepperoni()
                .withOnions()
                .withMushrooms()
                .build();
        pizzaHut.addPizza(largeThreeTopping);
        System.out.println(largeThreeTopping.eat());

        Pizza smallTwoTopping = new PizzaBuilder("Small")
                .withExtraCheese()
                .withPeppers()
                .build();
        pizzaHut.addPizza(smallTwoTopping);
        System.out.println(smallTwoTopping.eat());

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
        System.out.println(mediumEightTopping.eat());

        Pizza smallSixTopping = new PizzaBuilder("Small")
                .withHamAndPineapple()
                .withPepperoni()
                .withExtraCheese()
                .build();
        littleCaesars.addPizza(smallSixTopping);
        System.out.print(smallSixTopping.eat());

        PizzaChain dominos = new PizzaChain("Dominos");
        Pizza smallOneTopping = new PizzaBuilder("Small")
                .withExtraCheese()
                .build();
        dominos.addPizza(smallOneTopping);
        System.out.println(smallOneTopping.eat());

        Pizza differentLargeThreeTopping = new PizzaBuilder("Large")
                .withPepperoni()
                .withOlives()
                .withChicken()
                .build();
        dominos.addPizza(differentLargeThreeTopping);
        System.out.println(differentLargeThreeTopping.eat());


        // Macronutrient
        Macronutrient macronutrient = Macronutrient.getInstance();
        Customer customerPaleoOne = new Customer("Caveman", "Paleo");
        Customer customerVeganOne = new Customer("Rabbit", "Vegan");
        Customer customerNutAllergyOne = new Customer("Kernel", "Nut Allergy");
        Customer customerNoRestrictionsOne = new Customer("Omnivore", "No restrictions");
        Customer customerPaleoTwo = new Customer("PaleoTwo", "Paleo");
        Customer customerVeganTwo  = new Customer("VeganTwo", "Vegan");


        System.out.println(customerPaleoOne.name + " " + macronutrient.createMeal(customerPaleoOne.dietPlan));
        System.out.println(customerVeganOne.name + " " + macronutrient.createMeal(customerVeganOne.dietPlan));
        System.out.println(customerNutAllergyOne.name + " " + macronutrient.createMeal(customerNutAllergyOne.dietPlan));
        System.out.println(customerNoRestrictionsOne.name + " " + macronutrient.createMeal(customerNoRestrictionsOne.dietPlan));
        System.out.println(customerPaleoTwo.name + " " + macronutrient.createMeal(customerPaleoTwo.dietPlan));
        System.out.println(customerVeganTwo.name + " " + macronutrient.createMeal(customerVeganTwo.dietPlan));

    }
}

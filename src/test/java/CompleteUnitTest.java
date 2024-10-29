import mealplantests.FoodFactoryTest;
import mealplantests.MacroNutrientTest;
import pizzatests.PizzaBuilderTest;
import pizzatests.PizzaChainTest;
import pizzatests.PizzaTest;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CompleteUnitTest.class,
        PizzaBuilderTest.class,
        PizzaTest.class,
        PizzaTest.class,
        PizzaChainTest.class,
        FoodFactoryTest.class,
        MacroNutrientTest.class
        }) public class CompleteUnitTest {}

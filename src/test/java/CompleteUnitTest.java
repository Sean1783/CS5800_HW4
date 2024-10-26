
import mealplantests.FoodFactoryTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import pizzatests.PizzaBuilderTest;
import pizzatests.PizzaChainTest;
import pizzatests.PizzaTest;

@Suite
@SelectClasses({CompleteUnitTest.class,
        PizzaBuilderTest.class,
        PizzaTest.class,
        PizzaTest.class,
        PizzaChainTest.class,
        FoodFactoryTest.class,
        }) public class CompleteUnitTest {}

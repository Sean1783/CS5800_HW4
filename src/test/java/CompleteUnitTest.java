
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CompleteUnitTest.class,
        PizzaBuilderTest.class,
        PizzaTest.class,
        PizzaTest.class,
        PizzaChainTest.class
        }) public class CompleteUnitTest {}

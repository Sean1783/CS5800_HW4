
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CompleteUnitTest.class, PizzaBuilderTest.class, PizzaTest.class})
public class CompleteUnitTest {
}

import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest extends BaseTestCase {

    private String sex;
    boolean expectedDoesHaveMane;

    public ParameterizedLionTest(String sex, boolean expectedDoesHaveMane) throws Exception {
        super();
        this.sex = sex;
        this.expectedDoesHaveMane = expectedDoesHaveMane;
    }

    @Parameterized.Parameters
    public static Object[][] sexData() {
        return new Object[][] {
                {"Самка", false},
                {"Самец", true},
                {"Некоректные данные", false}
        };
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void constructorLionTest() throws Exception {
        if (!sex.equals("Самка") & !sex.equals("Самец")) {
            exceptionRule.expect(Exception.class);
            exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        }
        Lion lion = new Lion(sex, felineSpy);
        assertEquals(expectedDoesHaveMane, lion.doesHaveMane());
    }

}

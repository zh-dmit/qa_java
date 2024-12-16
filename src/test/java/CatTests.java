import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTests extends BaseTestCase {

    public CatTests() throws Exception {
    }

    @Test
    public void getSoundTest() {
        String expectedSound = "Мяу";
        assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void verifyGetFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(felineSpy, Mockito.times(1)).eatMeat();
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, cat.getFood());
    }
}

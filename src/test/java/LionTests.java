import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTests extends BaseTestCase {

    public LionTests() throws Exception {
    }

    @Test
    public void verifyGetKittensTest() throws Exception {
        lion.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensTest() throws Exception {
        int expectedKittens = 1;
        assertEquals(expectedKittens, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void verifyFoodTest() throws Exception {
        lion.getFood();
        Mockito.verify(felineSpy, Mockito.times(1)).getFood("Хищник");
    }

}

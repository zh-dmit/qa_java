import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests extends BaseTestCase {

    public FelineTests() throws Exception {
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void getKittensWithoutParameterTest() {
        int expectedKittens = 1;
        assertEquals(expectedKittens, feline.getKittens());
    }

    @Test
    public void verifyGetKittensWithoutParameterTest() {
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWithParameterTest() {
        int expectedKittens = 1;
        assertEquals(expectedKittens, feline.getKittens(expectedKittens));
    }

}

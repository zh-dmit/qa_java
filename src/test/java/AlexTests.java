import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTests extends BaseTestCase {

    public AlexTests() throws Exception {
    }

    @Test
    public void getFriendsTest() {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        String expectedPlace = "Нью-Йоркский зоопарк";
        assertEquals(expectedPlace, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() {
        int expectedKittens = 0;
        assertEquals(expectedKittens, alex.getKittens());
    }
}

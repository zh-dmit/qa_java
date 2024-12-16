import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTests extends BaseTestCase {

    public AlexTests() throws Exception {
    }

    @Test
    public void getFriendsTest() throws Exception {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        String expectedPlace = "Нью-Йоркский зоопарк";
        assertEquals(expectedPlace, alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest() throws Exception {
        int expectedKittens = 0;
        assertEquals(expectedKittens, alex.getKittens());
    }
}

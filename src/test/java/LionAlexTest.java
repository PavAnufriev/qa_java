import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getPlaceOfLivingReturnsCorrectPlaceOfLiving () throws Exception {
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        LionAlex lion = new LionAlex("Самец", feline);
        String actualPlaceOfLiving = lion.getPlaceOfLiving();
        assert (expectedPlaceOfLiving.equals(actualPlaceOfLiving));
    }


    @Test
    public void getAlexFriendsReturnsCorrectFriends () throws Exception {
        List <String> expectedFriends = List.of("Марти", "Мелман", "Глория");
        LionAlex lion = new LionAlex("Самец", feline);
        List <String> actualFriends = lion.getAlexFriends();

        System.out.println("Expected: " + expectedFriends);
        System.out.println("Actual:   " + actualFriends);
        System.out.println("Expected size: " + expectedFriends.size());
        System.out.println("Actual size:   " + actualFriends.size());

        Assert.assertEquals("Список друзей должен совпадать с ожидаемым", expectedFriends, actualFriends);
    }


    @Test
    public void getKittensReturnsCorrectKittensCount () throws Exception {
        int expectedKittensCount = 0;
        LionAlex lion = new LionAlex("Самец", feline);
        int actualKittensCount = lion.getKittens();
        assert (expectedKittensCount == actualKittensCount);
    }
}

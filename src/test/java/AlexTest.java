import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    Alex alex;

    @Test
    public void alexGetFriendsReturnsMartyGloriaMelman() throws Exception {
        alex = new Alex(feline);
        List<String> expectedFriends = Arrays.asList("Marty", "Gloria", "Melman");
        List<String> result = alex.getFriends();
        Assert.assertEquals(expectedFriends, result);
    }

    @Test
    public void alexGetPlaceOfLivingReturnsNewYorkZoo() throws Exception {
        alex = new Alex(feline);
        Assert.assertEquals("New York Zoo", alex.getPlaceOfLiving());
    }

    @Test
    public void alexGetKittensReturnsZero() throws Exception {
        alex = new Alex(feline);
        alex.getKittens();
        Mockito.verify(feline).getKittens(0);
    }
}

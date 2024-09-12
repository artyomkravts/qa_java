import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }


    @Test
    public void catGetSoundReturnsMeow() {
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catGetFoodCallsEatMeat() throws Exception {
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }







}

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline felineMock;

    Feline feline = new Feline();

    @Spy
    Feline felineSpy;

    @Test
    public void felineEatMeatCallsAnimalGetFoodWithPredatorArgument() throws Exception {
        // Нужно вызвать реальный метод, потому что иначе мок вернёт null
        // А если оставить feline реальным, то нельзя будет отследить через verify
        Mockito.when(felineMock.eatMeat()).thenCallRealMethod();
        felineMock.eatMeat();
        Mockito.verify(felineMock).getFood("Хищник");
    }

    @Test
    public void felineGetFamilyReturnsFeline() {
        String result = feline.getFamily();
        Assert.assertEquals("Кошачьи", result);

    }

    @Test
    public void felineGetKittens3Returns3() {
        Assert.assertEquals(3, felineSpy.getKittens(3));
    }

    @Test
    public void felineGetKittensNoArgumentsReturnsOne() {
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

}

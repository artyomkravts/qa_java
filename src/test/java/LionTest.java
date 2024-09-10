import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void lionConstructorInvalidSexThrowsException() throws Exception {
        Assert.assertThrows("Используйте допустимые значения пола животного - самей или самка",
                Exception.class,
                () -> {new Lion("asfdsdgaef", feline);}
        );
    }

    @Test
    public void lionGetKittensCallsFelineGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void lionGetFoodCallsFelineGetFoodWithArgument () throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }
}

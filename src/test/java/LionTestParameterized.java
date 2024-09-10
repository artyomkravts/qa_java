import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

@RunWith(Parameterized.class)
public class LionTestParameterized {

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); // Так подключаем мокито, если RunWith уже занят

    @Mock
    private static Feline feline;

    private String sex;
    private boolean expectedResult;

    public LionTestParameterized(String sex, Feline feline, boolean expectedResult) throws Exception {
        this.sex = sex;
        this.feline = feline;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", feline, true},
                {"Самка", feline, false},
        };
    }

    @Test
    public void lionDoesHaveManeValidOptions() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }




}

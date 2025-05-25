import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean hasMane;
    private final String expectedExceptionMessage;
    private Feline feline = new Feline();
    public LionParameterizedTest(String sex, boolean hasMane, String expectedExceptionMessage) {
        this.sex = sex;
        this.hasMane = hasMane;
        this.expectedExceptionMessage = expectedExceptionMessage;
    }

    @Parameterized.Parameters(name = "{index}: Test sex = {0}, hasMane = {1}, expectedExceptionMessage = {2}")
    public static Collection<Object[]> lionData() {
        return Arrays.asList(new Object[][]{
                {"Самец", true, null},
                {"Самка", false, null},
                {"Неизвестно", false, "Используйте допустимые значения пола животного самец или самка"}});
    }
    @Test
    public void doesManeReturnsCorrectMaleSex() throws Exception {
        if (expectedExceptionMessage == null) {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(hasMane, lion.doesHaveMane());
        }
    }


    @Test
    public void doesManeReturnsCorrectThrowsException () {
        if (expectedExceptionMessage != null) {
            try {
                new Lion(sex, feline);
                Assert.fail("Не выбрано исключение" + sex);
            } catch (Exception e) {
                Assert.assertEquals(expectedExceptionMessage, e.getMessage());
            }
        }
    }
}
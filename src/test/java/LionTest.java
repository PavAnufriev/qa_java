import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


// Тесты для класса Lion

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Feline mockFeline;

    Lion lion;

    @Before
    public void setUp () throws Exception {
        lion = new Lion("Самец", mockFeline);
    }

    @Test

    public void getKittensReturnsCorrectKittens (){
        int expectedKittensCount = 1;
        Mockito.when(mockFeline.getKittens()).thenReturn((expectedKittensCount));
        int actualKittensCount = lion.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);

    }


    @Test
    public void getFoodReturnsCorrectFood () throws Exception{
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }


}

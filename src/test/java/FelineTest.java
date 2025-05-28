import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
    public class FelineTest {

    // Создаем экземпляр класса
    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsCorrectFood () throws Exception {
        // Проверяем, что метод возвращает правильное значение
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);

    }

    @Test
    public void getFamilyReturnsCorrectFamily (){
        // Проверяем, что метод возвращает правильное значение
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnsCorrectKittensCount (){
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensReturnsCorrectKittensWithParametrs (){
        int kittensCount = 5;
        int expectedKittensCount = 5;
        int actualKittensCount = feline.getKittens(kittensCount);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

}

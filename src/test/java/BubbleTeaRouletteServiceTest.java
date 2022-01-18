import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import org.junit.jupiter.api.Test;
import testhelper.RandomStub;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BubbleTeaRouletteServiceTest {

    @Test
    public void shouldGenerateARandomBubbleTeaTypeWhenGetRandomBubbleTeaTypeIsCalled() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.JasmineMilkTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.JasmineMilkTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldReturnPeachTeaTypeWhenGetRandomBubbleTeaTypeIsCalled() {

        //Arrange
        RandomStub randomStub = new RandomStub(BubbleTeaTypeEnum.PeachIceTea.ordinal());
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.PeachIceTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }
    /**@todo: check exceptions handling in junit5*/
  /*  @Test //(expected: ArrayIndexOutOfBoundsException.class)
    public void shouldReturnErrorWhenGetRandomBubbleTeaTypeIsCalled() {
        RandomStub randomStub = new RandomStub(99);
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            BubbleTeaTypeEnum.values();
        });
        //Arrange


        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.PeachIceTea;

        //Assert
        assertThrows(actualResult,exception) ;
    //(expectedResult, actualResult);

    }*/
}

import com.techreturners.bubbleteaordersystem.model.BubbleTea;
import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import testhelper.RandomStub;

import java.util.EnumSet;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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


    @ParameterizedTest
    @EnumSource(BubbleTeaTypeEnum.class)
    public void shouldReturnEachTeaTypeWithParametersGetRandomBubbleTeaTypeIsCalled(BubbleTeaTypeEnum bttEnum) {
        EnumSet<BubbleTeaTypeEnum> teas =
                EnumSet.of(BubbleTeaTypeEnum.MatchaMilkTea, BubbleTeaTypeEnum.OolongMilkTea, BubbleTeaTypeEnum.JasmineMilkTea, BubbleTeaTypeEnum.PeachIceTea, BubbleTeaTypeEnum.LycheeIceTea);
        assertTrue(teas.contains(bttEnum));
    }

}


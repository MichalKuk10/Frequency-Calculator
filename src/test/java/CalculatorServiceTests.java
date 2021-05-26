

import Calculator.Model.SingleWordData;
import Calculator.Service.CalculatorService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalculatorServiceTests {

    @Test
    public void should_check_if_creates_object_with_correct_values(){
        //given
        CalculatorService service = new CalculatorService();
        String word = "House!!!";
        Set<Character> tempCharContained = new HashSet<>();
        tempCharContained.add('O');
        SingleWordData singleWordInput = new SingleWordData.Builder().matchingChars(tempCharContained).lengthOfWords(8).matchingOccurrencesNumber(1).build();

        //when
        List<SingleWordData> accualResult = service.createSingleWordInput(word);

        //then
        Assertions.assertEquals(accualResult.get(0).getLengthOfWord(), singleWordInput.getLengthOfWord());
    }
}

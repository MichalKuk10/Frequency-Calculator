

import Calculator.Model.SingleWordData;
import Calculator.Service.CalculatorService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalculatorServiceTests {
    CalculatorService service = new CalculatorService();
    String word = "House!!!";

    @Test
    public void should_check_if_creates_object_with_correct_values(){
        //given
        Set<Character> tempCharContained = new HashSet<>();
        tempCharContained.add('O');
        SingleWordData singleWordInput = new SingleWordData.Builder().matchingChars(tempCharContained).lengthOfWords(8).matchingOccurrencesNumber(1).build();

        //when
        List<SingleWordData> accualResult = service.createSingleWordData(word);

        //then
        Assertions.assertEquals(accualResult.get(0).getLengthOfWord(), singleWordInput.getLengthOfWord());
    }

    @Test
    public void should_check_if_correctly_counts_number_of_given_letters_in_word(){
        //given
        //when
        int expectedNumber = service.checkNumberOfLettersInGivenWord(word.toUpperCase());
        //then
        Assertions.assertEquals(1, expectedNumber);
    }

    @Test
    public void should_check_if_correctly_counts_number_of_letters_without_special_chars() {
        //given
        //when
        int expectedNumber = service.checkNumberOfLettersWithoutSpecialChar(word.toUpperCase());
        //then
        Assertions.assertEquals(5, expectedNumber);
    }

}

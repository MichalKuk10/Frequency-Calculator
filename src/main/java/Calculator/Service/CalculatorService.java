package Calculator.Service;

import Calculator.Model.SingleWordData;

import java.util.*;

public class CalculatorService {

    private final List<Character> LOGIC_WORD = Arrays.asList('L', 'O', 'G', 'I', 'C');
    private final List<Character> SPECIAL_CHARS = Arrays.asList(' ','!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',',
            '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~');

    public List<SingleWordData> createSingleWordData(String input){
        String[] inputSplitted = input.toUpperCase().split(" ");
        List<SingleWordData> singleWords =  new ArrayList<>();

        Arrays.stream(inputSplitted).forEach(word -> {
            Set<Character> tempCharContained = new HashSet<>();
            int matchingOccurrencesNumber = 0;

            for (int i = 0; i < word.length(); i++) {
                if (validate(LOGIC_WORD, word.charAt(i))) {
                    matchingOccurrencesNumber++;
                    tempCharContained.add(word.charAt(i));
                }
            }

            singleWords.add(new SingleWordData.Builder()
                    .matchingChars(tempCharContained)
                    .lengthOfWords(word.length())
                    .matchingOccurrencesNumber(matchingOccurrencesNumber)
                    .build());
        });
        return singleWords;
    }


    public int checkNumberOfLettersInGivenWord(String word){
        int numberOfOurWordLettersInInput = 0;
        for (int i = 0; i < word.length(); i++) {
            if (validate(LOGIC_WORD, word.charAt(i))) {
                numberOfOurWordLettersInInput++;
            }
        }
        return numberOfOurWordLettersInInput;
    }

    public  int checkNumberOfLettersWithoutSpecialChar(String word){
        int numberOfLettersInInput = 0;
        for (int i = 0; i<word.length(); i++){
            if (! validate(SPECIAL_CHARS, word.charAt(i))){
                numberOfLettersInInput++;
            }
        }
        return numberOfLettersInInput;
    }

    private boolean validate(List<Character> list, Character character){
        return list.contains(character);
    }
}

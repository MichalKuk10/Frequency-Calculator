package Calculator.Service;

import Calculator.Model.SingleWordData;

import java.util.*;

public class CalculatorService {

    private static final List<Character> logicWord = Arrays.asList('L', 'O', 'G', 'I', 'C');
    private static final List<Character> specialChars = Arrays.asList(' ','!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',',
            '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~');

    public List<SingleWordData> createSingleWordInput(String input){
        String[] inputSplitted = input.toUpperCase().split(" ");
        List<SingleWordData> singleWords =  new ArrayList<>();

        for (String word : inputSplitted){
            Set<Character> tempCharContained = new HashSet<>();
            int matchingOccurrencesNumber = 0;

            for (int i=0; i < word.length(); i++){
                if (logicWord.contains(word.charAt(i))){
                    matchingOccurrencesNumber++;
                    tempCharContained.add(word.charAt(i));
                }
            }

            singleWords.add(new SingleWordData.Builder().matchingChars(tempCharContained).lengthOfWords(word.length()).matchingOccurrencesNumber(matchingOccurrencesNumber).build());
        }
        return singleWords;
    }

    public int checkNumberOfLettersInGivenWord(String word){
        int numberOfOurWordLettersInInput = 0;
        for (int i = 0; i < word.length(); i++) {
            if (logicWord.contains(word.charAt(i))) {
                numberOfOurWordLettersInInput++;
            }
        }
        return numberOfOurWordLettersInInput;
    }

    public  int checkNumberOfLettersWithoutSpecialChar(String word){
        int numberOfLettersInInput = 0;
        for (int i = 0; i<word.length(); i++){
            if (!specialChars.contains(word.charAt(i))){
                numberOfLettersInInput++;
            }
        }
        return numberOfLettersInInput;
    }
}

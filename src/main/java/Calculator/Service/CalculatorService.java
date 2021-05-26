package Calculator.Service;

import java.util.Arrays;
import java.util.List;

public class CalculatorService {

    private static final List<Character> logicWord = Arrays.asList('L', 'O', 'G', 'I', 'C');
    private static final List<Character> specialChars = Arrays.asList(' ','!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',',
            '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~');



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

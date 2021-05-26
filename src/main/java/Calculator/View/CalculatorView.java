package Calculator.View;

import Calculator.Model.SingleWordData;

public class CalculatorView {

    public void print(SingleWordData singleWord, String formatToDecimal, int numberOfLettersInGivenWord){
        System.out.println("{" + singleWord.getMatchingChars()+ ", " + singleWord.getLengthOfWord() + "} = " + formatToDecimal + " (" + singleWord.getMatchingOccurrencesNumber() + "/" + numberOfLettersInGivenWord +")");

    }

    public void printTotalFrequency(String totalFrequency, int occurencesWithoutSpecialChar, int numberOfLettersInGivenWord){
        System.out.println("TOTAL Frequency: " + totalFrequency + " (" + numberOfLettersInGivenWord + "/" + occurencesWithoutSpecialChar + ")");

    }
}

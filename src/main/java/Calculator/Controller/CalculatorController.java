package Calculator.Controller;

import Calculator.Database.InputReader;
import Calculator.Database.UserInput;
import Calculator.Model.SingleWordData;
import Calculator.Service.CalculatorService;
import Calculator.View.CalculatorView;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();
    private final InputReader inputReader = new UserInput();
    private final CalculatorView calculatorView = new CalculatorView();


    public void countOccurrences(String input){
        String inputToUpperCase = input.toUpperCase();
        int numberOfLettersInGivenWord = calculatorService.checkNumberOfLettersInGivenWord(inputToUpperCase);
        int occurrencesWithoutSpecialChar = calculatorService.checkNumberOfLettersWithoutSpecialChar(inputToUpperCase);
        List<SingleWordData> singleWordInput = calculatorService.createSingleWordData(inputToUpperCase);

        Collections.sort(singleWordInput);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        singleWordInput.forEach(singleWord -> {
            double v = (double) singleWord.getMatchingOccurrencesNumber() / (double) numberOfLettersInGivenWord;
            String formatToDecimal = decimalFormat.format(v);
            calculatorView.print(singleWord, formatToDecimal, numberOfLettersInGivenWord);
        });

        String totalFrequency = decimalFormat.format((double)numberOfLettersInGivenWord/occurrencesWithoutSpecialChar);
        calculatorView.printTotalFrequency(totalFrequency, occurrencesWithoutSpecialChar, numberOfLettersInGivenWord);

    }
}

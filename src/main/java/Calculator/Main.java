package Calculator;


import Calculator.Controller.CalculatorController;
import Calculator.Database.InputReader;
import Calculator.Database.UserInput;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new UserInput();
        System.out.println("Please enter sentence that you want to validate: ");
        String input = inputReader.readInput();
        CalculatorController calculatorController = new CalculatorController();
        calculatorController.countOccurrences(input);

    }
}

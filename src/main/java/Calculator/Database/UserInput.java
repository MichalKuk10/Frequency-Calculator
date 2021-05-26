package Calculator.Database;

import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput implements InputReader {
    @Override
    public String readInput() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String input = scanner.nextLine();
        return input;
    }
}

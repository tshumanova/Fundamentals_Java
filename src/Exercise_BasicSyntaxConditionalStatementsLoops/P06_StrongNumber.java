package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int num = number;
        int allDigitFact = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = num % 10;
            num /= 10;
            int fact = 1;

            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }
            allDigitFact += fact;
        }
        if (number == allDigitFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

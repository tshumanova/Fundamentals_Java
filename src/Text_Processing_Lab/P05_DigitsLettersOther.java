package Text_Processing_Lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P05_DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)) {
                digits.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letters.append(symbol);
            } else {
                others.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}

package Exercise_Methods;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);
        printSequenceOfChars(symbolOne, symbolTwo);
    }

    private static void printSequenceOfChars(char symbolOne, char symbolTwo) {
        if (symbolOne < symbolTwo) {
            for (char symbol = (char) (symbolOne + 1); symbol < symbolTwo; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char) (symbolTwo + 1); symbol < symbolOne; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}

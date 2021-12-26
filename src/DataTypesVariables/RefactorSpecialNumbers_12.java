package DataTypesVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int num = 1; num <= number; num++) {
            int sumOfDigit = 0;
            int digit = num;

            while (digit > 0) {
                sumOfDigit += digit % 10;
                digit = digit / 10;
            }
            if (sumOfDigit == 5 || sumOfDigit == 7 || sumOfDigit == 11) {
                System.out.printf("%d -> True\n", num);

            } else {
                System.out.printf("%d -> False\n", num);
            }
        }

    }
}

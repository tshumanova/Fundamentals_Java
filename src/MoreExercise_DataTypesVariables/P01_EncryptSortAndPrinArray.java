package MoreExercise_DataTypesVariables;

import java.util.Arrays;
import java.util.Scanner;

public class P01_EncryptSortAndPrinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[numberOfStrings];

        for (int i = 0; i < numberOfStrings; i++) {
            String sequence = scanner.nextLine();
            int len = sequence.length();
            int sum = 0;
            for (int j = 0; j < sequence.length(); j++) {
                char currentChar = sequence.charAt(j);
                {
                    sum += currentChar * len;
                }

            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
    }
}

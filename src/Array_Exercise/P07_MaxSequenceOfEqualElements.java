package Array_Exercise;

import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayAsString = scanner.nextLine().split("\\s+");
        int[] arrayAsInt = new int[arrayAsString.length];
        for (int i = 0; i < arrayAsString.length; i++) {
            arrayAsInt[i] = Integer.parseInt(arrayAsString[i]);
        }
        int currentCount = 1;
        int max = 1;
        int numOfSequence = 0;
        for (int j = 0; j < arrayAsInt.length - 1; j++) {
            if (arrayAsInt[j] == arrayAsInt[j + 1]) {
                currentCount++;
                if (currentCount > max) {
                    max = currentCount;
                    numOfSequence = arrayAsInt[j];
                }
            } else {
                currentCount = 1;
            }
        }
        for (int i = 0; i < max; i++) {
            System.out.println(numOfSequence + " ");

        }
    }
}

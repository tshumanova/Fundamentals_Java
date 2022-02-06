package Arrays;

import java.util.Scanner;

public class CondenseArrayToNumbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineOfNumbers = scanner.nextInt();

        int[] numbers = new int[lineOfNumbers];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = scanner.nextInt();
        }
        int numRepetition = numbers.length - 1;
        for (int repetition = 0; repetition < numRepetition; repetition++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i] + numbers[i + 1];
            }
        }
        System.out.println(numbers[0]);
    }
}

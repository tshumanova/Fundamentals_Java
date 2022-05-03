package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T07_CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int repetition = 0; repetition < numbers.length - 1; repetition++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i] + numbers[i + 1];
            }
        }
        System.out.println(numbers[0]);
    }
}

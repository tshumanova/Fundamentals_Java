package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        int[] numbers = Arrays
                .stream(inputLine.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        int maxLength = Math.max(firstArr.length, secondArr.length);
        for (int i = 0; i < maxLength; i++) {
            sum += firstArr[i];

            if (firstArr[i] == secondArr[i]) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
                break;
            }
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

    }
}
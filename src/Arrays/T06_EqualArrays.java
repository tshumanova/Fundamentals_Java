package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T06_EqualArrays {
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

        boolean arrayAreEquals;
        int sum = 0;
        int differenceIndex = 0;

        if (firstArr.length != secondArr.length) {
            arrayAreEquals = false;
            differenceIndex = Math.min(firstArr.length, secondArr.length);
        } else {
            arrayAreEquals = true;
            for (int i = 0; i < firstArr.length; i++) {
                sum += firstArr[i];
                if (firstArr[i] != secondArr[i]) {
                    arrayAreEquals = false;
                    differenceIndex = i;
                    break;
                }
            }
        }
        if (arrayAreEquals) {
            System.out.printf("Arrays are identical. Sum: %d",sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",differenceIndex);
        }
    }
}

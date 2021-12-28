package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        int[] numArr = Arrays
                .stream(inputLine.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            int currentEl = numArr[i];
            if (currentEl % 2 == 0) {
                sum = currentEl;
            }
            System.out.println(sum);
        }

    }
}

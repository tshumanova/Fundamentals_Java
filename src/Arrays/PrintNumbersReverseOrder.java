package Arrays;

import java.util.Scanner;

public class PrintNumbersReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[number];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numArr.length - 1; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }
}

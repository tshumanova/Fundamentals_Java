package Arrays;

import java.util.Scanner;

public class T03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        String[] items = value.split("\\s+");
        int[] arr = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.print(sum);
    }
}


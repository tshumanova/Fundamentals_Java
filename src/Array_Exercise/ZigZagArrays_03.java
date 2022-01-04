package Array_Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for (int line = 0; line < n; line++) {
            String input = scanner.nextLine();
            String firstNumber = input.split(" ")[0];
            String secondNumber = input.split(" ")[1];
            if ((line + 1) % 2 == 1) {
                firstArray[line] = firstNumber;
                secondArray[line] = secondNumber;
            } else {
                firstArray[line] = secondNumber;
                secondArray[line] = firstNumber;
            }
        }
        for (String element : firstArray) {
            System.out.print(element + " ");

        }  System.out.println();
        for (String element:secondArray) {
            System.out.print(element + " ");
        }
    }
}


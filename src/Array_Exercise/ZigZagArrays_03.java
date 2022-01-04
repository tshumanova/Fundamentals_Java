package Array_Exercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int line = 0; line < n; line++) {
            String input= scanner.nextLine();
            String firstNumber =input.split(" ")[0];
            String secondNumber=input.split(" ")[1];
            System.out.println();
        }
    }
}

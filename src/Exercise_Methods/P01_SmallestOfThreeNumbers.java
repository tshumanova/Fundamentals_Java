package Exercise_Methods;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallestNum = getSmallestNumber(num1, num2, num3);

        System.out.println(smallestNum);

    }

    private static int getSmallestNumber(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3}
    }
}
}

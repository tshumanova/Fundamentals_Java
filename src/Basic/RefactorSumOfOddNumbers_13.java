package Basic;

import java.util.Scanner;

public class RefactorSumOfOddNumbers_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            sum = (2 * i + 1);
            System.out.println(sum);
            total += sum;
        }
        System.out.printf("Sum: %d%n", total);

    }
}

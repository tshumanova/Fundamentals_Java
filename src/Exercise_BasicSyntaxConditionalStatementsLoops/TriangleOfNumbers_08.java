package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j += 1) {

                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}

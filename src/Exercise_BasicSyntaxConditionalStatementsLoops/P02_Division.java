package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P02_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //2,3,6,7,10
        int num = 0;
        boolean isDevisible = true;
        if (number % 10 == 0) {
            num = 10;
        } else if (number % 7 == 0) {
            num = 7;
        } else if (number % 6 == 0) {
            num = 6;
        } else if (number % 3 == 0) {
            num = 3;
        } else if (number % 2 == 0) {
            num = 2;
        } else {
            isDevisible = false;
        }
        if (isDevisible) {
            System.out.printf("The number is divisible by %d", num);
        } else {
            System.out.println("Not divisible");
        }
    }
}

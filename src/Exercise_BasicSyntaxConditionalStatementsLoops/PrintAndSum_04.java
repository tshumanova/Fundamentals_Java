package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int num = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i+" ");
            num += i;
        }
        System.out.println();
        System.out.print("Sum: "+ num);
    }
}

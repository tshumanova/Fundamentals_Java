package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P011_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0.0;
        int keyboardTrashes=0;
        for (int i = 1; i <= lostGame; i++) {
            if (i % 2 == 0) {
                expenses += headSetPrice;
            }
            if (i % 3 == 0) {
                expenses += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                keyboardTrashes++;
                expenses += keyboardPrice;
            }
            if(keyboardTrashes%2==0){
                expenses+=displayPrice;
            }
        }

    }
}

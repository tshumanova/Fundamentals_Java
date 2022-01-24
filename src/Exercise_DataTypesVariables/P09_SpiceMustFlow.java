package Exercise_DataTypesVariables;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int storage = 0;
        int days = 0;
        int tab = 0;
        while (yield >= 100) {
            storage += yield - 26;
            days++;
            tab -= 10;
        }

        if (storage >= 26) {
            storage -= 26;
        }

        System.out.println(days);
        System.out.println(storage);
    }
}

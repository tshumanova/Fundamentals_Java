package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount;
        peopleCount = scanner.nextInt();
        scanner.nextLine();
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0.0;
//        double sum = price * peopleCount;
        double discount = 1.0;


        if (groupType.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }

            if (peopleCount >= 30) {
                discount = 0.85;
            }

        } else if (groupType.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }

            if (peopleCount >= 100) {
                peopleCount -= 10;
            }

        } else if (groupType.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.5;
            }

            if (peopleCount >= 10 && peopleCount <= 20) {
                discount = 0.95;
            }

        }

        double sum = price * peopleCount * discount;

        System.out.printf("Total price: %.2f", sum);


    }
}


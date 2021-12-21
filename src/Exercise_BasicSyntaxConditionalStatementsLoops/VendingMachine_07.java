package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        double sum = 0;
        while (!"Start".equals(command)) {
            double coins = Double.parseDouble(command);
            if (coins == 0.1) {
                sum += coins;
            } else if (coins == 0.2) {
                sum += coins;
            } else if (coins == 0.5) {
                sum += coins;
            } else if (coins == 1) {
                sum += coins;
            } else if (coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }
            command = scanner.nextLine();
        }
        String good = scanner.nextLine();
        double price = 0;
        boolean isGood = false;
        while (!"End".equals(good)) {
            switch (good) {
                case "Nuts" -> {
                    price = 2.0;
                    isGood = true;
                }
                case "Water" -> {
                    price = 0.7;
                    isGood = true;
                }
                case "Crisps" -> {
                    price = 1.5;
                    isGood = true;
                }
                case "Soda" -> {
                    price = 0.8;
                    isGood = true;
                }
                case "Coke" -> {
                    price = 1.0;
                    isGood = true;
                }
            }
            if (sum < price) {
                System.out.println("Sorry, not enough money");
            } else if (isGood) {
                System.out.printf("Purchased %s\n", good);
                sum -= price;
            } else {
                System.out.println("Invalid product");
            }
            good = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}


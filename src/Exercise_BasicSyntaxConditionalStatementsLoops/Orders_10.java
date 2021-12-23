package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Orders_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double priceOrders = 0.0;
        double priceTotal = 0.0;
        for (int i = 1; i <= orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int numberOfCapsules = Integer.parseInt(scanner.nextLine());
            priceOrders = (days * numberOfCapsules) * pricePerCapsule;
            priceTotal += priceOrders;

            System.out.printf("The price for the coffee is: $%.2f\n", priceOrders);
        }
        System.out.printf("Total: $%.2f", priceTotal);

    }
}


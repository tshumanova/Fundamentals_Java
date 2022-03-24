package MidExam_1;

import java.util.Scanner;

public class P1_CookingMasterclass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());
        int freePackages = students / 5;

        double neededItems = apronPrice * Math.ceil(students * 1.2)
                + eggPrice * 10 * (students) + flourPrice * (students - freePackages);

        if (neededItems <= budget) {
            System.out.printf("Items purchased for %.2f$.\n", neededItems);
        } else {
            double neededMoney = neededItems - budget;
            System.out.printf("%.2f$ more needed.\n", neededMoney);
        }
    }
}

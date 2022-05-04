package Array_Exercise;

import java.util.Scanner;

public class T02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split("\\s+");
        String[] secondArr = scanner.nextLine().split("\\s+");

        for (String secondElements : secondArr) {
            for (String firstElement : firstArr) {
                if (secondElements.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}

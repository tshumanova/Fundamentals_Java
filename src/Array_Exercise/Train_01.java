package Array_Exercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[countWagons];

        for (int wagon = 0; wagon < countWagons; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[wagon] = countPeople;
        }
        int sum = 0;
        for (int index = 0; index < wagons.length; index++) {
            int currentElement = wagons[index];
            System.out.print(currentElement + " ");
            sum += currentElement;
        }
        System.out.println();
        System.out.println(sum);
    }
}


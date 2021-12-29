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
    }
}

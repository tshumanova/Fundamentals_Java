package Array_Exercise;

import java.util.Scanner;

public class T01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];

        for (int i = 0; i < wagons.length; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            wagons[i] = people;
        }
        int sumPeoples = 0;
        for (int i = 0; i < wagons.length; i++) {
            sumPeoples += wagons[i];
            System.out.print(wagons[i] + " ");
        }
        System.out.println();
        System.out.print(sumPeoples);
    }

}

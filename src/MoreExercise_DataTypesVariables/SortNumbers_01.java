package MoreExercise_DataTypesVariables;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne);
            if (numberTwo > numberThree) {
                System.out.println(numberTwo);
                System.out.println(numberThree);
            } else {
                System.out.println(numberThree);
                System.out.println(numberTwo);
            }
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo);
            if (numberOne > numberThree) {
                System.out.println(numberOne);
                System.out.println(numberThree);
            } else {
                System.out.println(numberThree);
                System.out.println(numberOne);
            }
        } else if (numberThree > numberOne && numberTwo < numberThree) {
            System.out.println(numberThree);
            if (numberOne < numberTwo) {
                System.out.println(numberTwo);
                System.out.println(numberOne);
            } else {
                System.out.println(numberOne);
                System.out.println(numberTwo);
            }
        }

    }
}
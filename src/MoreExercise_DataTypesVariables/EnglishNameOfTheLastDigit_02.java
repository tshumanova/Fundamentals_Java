package MoreExercise_DataTypesVariables;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int numberAbs = Math.abs(number);
        int lastNumber = number % 10;
        String englishNumberName = "";

        if (lastNumber == 0) {
            englishNumberName = "zero";
        } else if (lastNumber == 1) {
            englishNumberName = "one";
        } else if (lastNumber == 2) {
            englishNumberName = "two";
        } else if (lastNumber == 3) {
            englishNumberName = "three";
        } else if (lastNumber == 4) {
            englishNumberName = "four";
        } else if (lastNumber == 5) {
            englishNumberName = "five";
        } else if (lastNumber == 6) {
            englishNumberName = "six";
        } else if (lastNumber == 7) {
            englishNumberName = "seven";
        } else if (lastNumber == 8) {
            englishNumberName = "eight";
        } else if (lastNumber == 9) {
            englishNumberName = "nine";
        }
        System.out.println(englishNumberName);
    }
}

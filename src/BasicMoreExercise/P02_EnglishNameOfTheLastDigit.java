package BasicMoreExercise;

import java.util.Scanner;

public class P02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int numberAbs = Math.abs(number);
        int lastNumber = numberAbs % 10;
        String name = "";

        if (lastNumber == 0) {
            name = "zero";
        } else if (lastNumber == 1) {
            name = "one";
        } else if (lastNumber == 2) {
            name = "two";
        } else if (lastNumber == 3) {
            name = "three";
        } else if (lastNumber == 4) {
            name = "four";
        } else if (lastNumber == 5) {
            name = "five";
        } else if (lastNumber == 6) {
            name = "six";
        } else if (lastNumber == 7) {
            name = "seven";
        } else if (lastNumber == 8) {
            name = "eight";
        } else if (lastNumber == 9) {
            name = "nine";
        }
        System.out.println(name);
    }
}


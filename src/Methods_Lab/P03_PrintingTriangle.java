package Methods_Lab;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        printIncreasingNumbers(number);

    }

    private static void printIncreasingNumbers(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i);
            if (i < length) {
                System.out.print(" ");
            }
        }

        private static void printArray ( int[] numbers){
            for (int number : numbers) {
                System.out.println(number + " ");
            }
            System.out.println();


        }

    }


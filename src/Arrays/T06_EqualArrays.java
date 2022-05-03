package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class T06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean arrayAreEquals;
        if (firstArr.length != secondArr.length) {
            arrayAreEquals = false;
        } else {
            arrayAreEquals = true;
            for (int i = 0; i < firstArr.length; i++) {

            }
        }
    }

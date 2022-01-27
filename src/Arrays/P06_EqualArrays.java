package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        int[] firstArr = Arrays
                .stream(inputLine.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays
                .stream(inputLine.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

    }
}

package Array_Exercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <= countRotations; rotation++) {
            String firstElement = array[0];
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = firstElement;
        }
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}

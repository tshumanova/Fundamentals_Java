package Array_Exercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String[] array1 = firstLine.split(" ");
        String[] array2 = secondLine.split(" ");

        for (String elementInSecond : array2) {
            for (String elementInFirst : array1) {
                if (elementInSecond.equals(elementInFirst)) {
                    System.out.print(elementInSecond + " ");
                }
            }
        }
    }
}

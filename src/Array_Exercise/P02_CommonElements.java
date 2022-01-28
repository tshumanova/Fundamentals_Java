package Array_Exercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String second : secondArr) {

            for (String first : firstArr) {
                if (second.equals(first)) {
                    System.out.println("first" + " ");
                }
            }
        }
    }
}
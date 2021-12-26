package DataTypesVariables;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c =scanner.nextLine().charAt(0);
        if (Character.isUpperCase('c')) {
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");

        }
    }
}

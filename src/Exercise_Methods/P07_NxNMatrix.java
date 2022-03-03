package Exercise_Methods;

import java.util.Scanner;

public class P07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        nxnMatrix(number);
    }

    public static void nxnMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println(number + " ");
            }
            System.out.println(" ");
        }
    }
}
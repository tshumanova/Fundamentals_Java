package MoreExercise_DataTypesVariables;

import java.util.Scanner;

public class P02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] old_row = {1};
        System.out.println(1);

        for (int i = 2; i <= n; i++) {
            int[] row = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 && j == i - 1) row[j] = 1;
            }
            for (int nuber:row) {
                System.out.println();
            }
        }
    }
}
}

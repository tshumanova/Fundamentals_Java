package Basic;

import java.util.Scanner;

public class MultiplicatioTable_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        //{theInteger} X {times} = {product}

        if (times >= number) {
            for (int j = times; j <= 10; j++) {
                int product = number * j;
                System.out.printf("%d X %d = %d\n", number, j, product);
            }
        } else {
            for (int j = times; j <= 10; j++) {
                int product = number * j;
                System.out.printf("%d X %d = %d\n", number, j, product);

            }
        }
        if (times >= 10) {
            int product = number * times;
            System.out.printf("%d X %d = %d\n", number, times, product);
        }
    }

}





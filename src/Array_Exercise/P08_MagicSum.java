package Array_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int number=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < ; j++) {

            }
        }
    }
}

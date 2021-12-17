package Exercise_DataTypesVariables;

import java.util.Arrays;
import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int count = 0;

        int firstTimePower = power;
        while (power >= distance) {
            power -= distance;
            count++;
            if (power == firstTimePower * 0.5) {
                if (exhaustionFactor > 0) {
                    power = power / exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}

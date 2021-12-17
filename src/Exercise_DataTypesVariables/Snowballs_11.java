package Exercise_DataTypesVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSnowball = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = Double.MIN_VALUE;
        int snowballSnowHighestBall = 0;
        int snowballTimeSnowHighestBall = 0;
        int snowballQualitySnowHighestBall = 0;

        for (int snowball = 1; snowball <= countSnowball; snowball++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;
                snowballSnowHighestBall = snowballSnow;
                snowballTimeSnowHighestBall = snowballTime;
                snowballQualitySnowHighestBall = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowHighestBall,snowballTimeSnowHighestBall,maxSnowballValue, snowballQualitySnowHighestBall);
    }
}

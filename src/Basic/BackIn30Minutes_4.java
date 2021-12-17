package Basic;

import java.util.Scanner;

public class BackIn30Minutes_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hourToMinutes = hours * 60;
        int totalMinutes = hourToMinutes + minutes + 30;
        int realHour = totalMinutes / 60;
        int realMinutes = totalMinutes % 60;
        if (realHour == 24) {
            System.out.printf("0:%02d", realMinutes);
        } else if (realMinutes < 10) {
            System.out.printf("%d:0%d", realHour, realMinutes);
        } else {
            System.out.printf("%d:%d", realHour, realMinutes);
        }
    }
}

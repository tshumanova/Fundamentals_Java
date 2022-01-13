package Basic;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        minutes += 30;
        if (minutes > 59) {
            hours += 1;
            minutes -= 60;
        }
        if (hours > 23) {
            hours -= 24;
        }
        System.out.printf("%2d:%02d", hours, minutes);


    }
}

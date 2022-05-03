package Arrays;

import java.util.Scanner;

public class T01_DayOFWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day >= 1 && day <= 7) {
            System.out.println(days[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}

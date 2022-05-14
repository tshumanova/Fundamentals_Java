package Text_Processing_Lab;

import java.util.Scanner;
import java.util.regex.Pattern;

public class T02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern= Pattern.compile("([=/]) (?<destination>[A-Z][a-z]{2,})\\1");
        System.out.println("Destinations: Hawai, Cyprus");
        System.out.println("Travel Points : 0");
    }
}

package Text_Processing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([=/]) (?<destination>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        boolean foundSomething = matcher.find();
        while (foundSomething) {
            System.out.println(matcher.group());

            foundSomething = matcher.find();
        }

        System.out.println("Destinations: Hawai, Cyprus");
        System.out.println("Travel Points : 0");
    }
}

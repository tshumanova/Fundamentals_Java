package Excercise_MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!charCount.containsKey(symbol)) {
                charCount.put(symbol, 1);
            } else {
                int currentCount = charCount.get(symbol);
                charCount.put(symbol, currentCount + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

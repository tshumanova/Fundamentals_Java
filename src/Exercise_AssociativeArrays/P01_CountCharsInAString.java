package Exercise_AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> charsCount = new LinkedHashMap<>();
        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!charsCount.containsKey(symbol)) {
                charsCount.put(symbol, 1);
            } else {
                int currentCount = charsCount.get(symbol);
                charsCount.put(symbol, currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

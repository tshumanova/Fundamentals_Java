package Exercise_AssociativeArrays;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> charsCount = new Hashtable<>();
        for (char symbol : text.toCharArray()) {
           if(symbol==' '){
               continue;
           }

            if (!charsCount.containsKey(symbol)) {
                charsCount.put(symbol, 1);
            } else {
                int currentCount=charsCount.get(symbol);
                charsCount.put(symbol,currentCount+1);
            }
        }

    }
}

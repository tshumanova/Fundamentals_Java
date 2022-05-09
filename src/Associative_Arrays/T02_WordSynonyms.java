package Associative_Arrays;

import java.util.*;

public class T02_WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordsMap = new HashMap<>();
        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, new ArrayList<>());
                wordsMap.get(word).add(synonym);
            } else {
                wordsMap.get(word).add(synonym);
            }
        }
    }
}

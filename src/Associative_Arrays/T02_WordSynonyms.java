package Associative_Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class T02_WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordsMap = new HashMap<>();
        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
        }
    }
}

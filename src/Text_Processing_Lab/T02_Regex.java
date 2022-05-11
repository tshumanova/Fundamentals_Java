package Text_Processing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T02_Regex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");
        List<String> resultList = new ArrayList<>();
        for (String s : wordsArr) {
            resultList.add(repeatString(s, s.length()));
        }
        System.out.println(String.join("", resultList));
    }

    private static String repeatString(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }


}

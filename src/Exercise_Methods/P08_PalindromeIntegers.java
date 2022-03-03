package Exercise_Methods;

import java.util.Scanner;

public class P08_PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("END")) {
            reveredWord(word);
            word = scanner.nextLine();
        }
    }

    static void reveredWord(String word) {
        String reversed = new StringBuffer(word).reverse().toString();
        if (word.equals((reversed))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

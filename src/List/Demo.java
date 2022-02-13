package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);


        for (int i = words.size()-1; i>=0 ; i++) {
            System.out.println(words.get(i));
        }
        /*some
        I
        text
        than
        one
        brother
        .
         */

    }
}

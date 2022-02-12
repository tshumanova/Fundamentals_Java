package Exercise_Methods;

import java.util.Scanner;

public class CharacterslnRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printCharacter(start, end);

    }

    public static void printCharacter(char start, char end) {
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }
        for (int i = start + 1; i < end; i++) {

            System.out.printf("%c ", i);
        }
    }
}

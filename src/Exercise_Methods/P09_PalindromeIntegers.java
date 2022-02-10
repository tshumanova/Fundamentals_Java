package Exercise_Methods;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();

        while(!command.equals("END")){
            System.out.println(isPalindrome(command));
            command= scanner.nextLine();
        }
    }
}

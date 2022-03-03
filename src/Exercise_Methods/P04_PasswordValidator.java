package Exercise_Methods;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isPasswordValidLength = isValidLength(password);
        if (!isPasswordValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidPasswordContent = isValidContent(password);
        if (!isValidPasswordContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (isPasswordValidLength && isValidPasswordContent && isValidPasswordCountDigits) {
            System.out.println("Password is vadlid");
        }
    }

    private static boolean isValidLength(String password);

    {

    }
}

package Exercise_Methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //проверка за дължина -> [6;10]
        //проверка за съдържанието -. само букви и цифри
        //проверка за брой на цифрите -> минимум 2
        boolean isPasswordValidLength = isValidLength(password);
        if (!isPasswordValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidPasswordContent = isValidContent(password);
        if (!isValidPasswordContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidPasswordCountDigit = isValidContent(password);
        if (!isValidPasswordCountDigit) {
            System.out.println("Password must have at least 2 digits");

        }
        //for (int index = 0; index < password.length(); index++) {
        //   char currentSymbol = password.charAt(index);
        if (isPasswordValidLength && isValidPasswordContent && isValidPasswordCountDigit) {
            System.out.println("Password is valid");
        }
    }

    //метод за валидиране на дължината->true(valid), false(invalid)
    private static boolean isValidLength(String password) {
       /* if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }*/
        //Върни ми стойността на този израз
        return password.length() >= 6 && password.length() <= 10;
    }

    //метод за валидиране а съдържанието
    private static boolean isValidContent(String password) {
        //всички символи да са буква или цифра
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {

                return false;
            }
        }
        return true;
    }

    // обхождане всички символи
    //ако даден символ не е буква или цифра->false


    //метод за валидиране на брой на цифрите
    private static boolean isValidCountDigits(String password) {
        int count = 0;
        //Обхождам всеки един символ и дали е цифра увеличавам
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        return count >= 2;
    }


}

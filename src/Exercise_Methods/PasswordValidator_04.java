package Exercise_Methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //проверка за дължина -> [6;10]
        //проверка за съдържанието -. само букви и цифри
        //проверка за брой на цифрите -> минимум 2
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
    //метод за валидиране на брой на цифрите


}

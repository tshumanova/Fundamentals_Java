package Text_Processing_Lab;

import java.util.Scanner;

public class T01_TheImitationGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String massage = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            //TODO

            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + massage);
    }
}

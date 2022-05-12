package Text_Processing_Lab;

import java.util.Scanner;

public class T01_TheImitationGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String massage = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Move":
                    break;
                case "Insert":
                    break;
                case "ChangeAll":
                    break;
                default:
                    throw new IllegalStateException("Unknown command" + commandName);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + massage);
    }
}

package Text_Processing_Lab;

import java.util.Scanner;

public class T01_TheImitationGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;
                case "ChangeAll":
                    message = changeAll(message, commandParts[1], commandParts[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknown command" + commandName);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }

    private static String insert(String message, int index, String substring) {

        return null;
    }

    private static String move(String message, int parseInt) {
        return null;
    }


}

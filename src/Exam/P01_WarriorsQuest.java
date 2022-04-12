package Exam;

import java.util.Scanner;

public class P01_WarriorsQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();
        //boolean exist = false;
        while (!"For Azeroth".equals(input)) {
            //    exist = false;
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if ("GladiatorStance".equals(command)) {
                text = text.toUpperCase();
                System.out.println(text);
                //     exist = true;
            } else if ("DefensiveStance".equals(command)) {
                text = text.toLowerCase();
                System.out.println(text);
                //    exist = true;
            } else if ("Dispel".equals(command)) {
                int index = Integer.parseInt(tokens[1]);
                char letter = tokens[2].charAt(0);
                if (index >= 0 && index <= text.length()) {
                    StringBuilder sb = new StringBuilder(text);
                    sb.setCharAt(index, letter);
                    text = sb.toString();
                    System.out.println("Success!");
                } else {
                    System.out.println("Dispel too weak.");
                }
            } else if ("Target".equals(command)) {
                if ("Change".equals(tokens[1])) {
                    String firstSubString = tokens[2];
                    String secondsSubString = tokens[3];
                    text = text.replace(firstSubString, secondsSubString);
                    System.out.println(text);
                } else if ("Remove".equals(tokens[1])) {
                    String substring = tokens[2];
                    text = text.replace(substring, "");
                    System.out.println(text);
                } else if ("change".equals(tokens[1])) {
                    System.out.println("Command doesn't exist!");
                } else if ("remove".equals(tokens[1])) {
                    System.out.println("Command doesn't exist!");
                } else {
                    System.out.println("Command doesn't exist!");
                }
            } else {
                System.out.println("Command doesn't exist!");
                break;
            }

            input = scanner.nextLine();
        }
    }
}


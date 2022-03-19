package Excercise_MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> resource = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!"stop".equals(command)) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resource.containsKey(command)) {
                resource.put(command, quantity);
            } else {
                resource.put(command, resource.get(command) + quantity);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resource.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
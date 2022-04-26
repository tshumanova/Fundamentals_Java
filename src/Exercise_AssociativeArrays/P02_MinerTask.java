package Exercise_AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resource = new LinkedHashMap<>();
        String command = scanner.nextLine();

        while (!command.equals("stop")) {
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


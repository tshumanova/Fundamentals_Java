package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strList = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {

            String[] comTwo = line.split(" ");
            String cmd = comTwo[0];
            line = scanner.nextLine();
            if (cmd.equals("Delete")) {
                String elem = comTwo[1];
                while (strList.contains(elem)) {
                    strList.remove(elem);
                }
            } else {
                String elem = comTwo[1];
                int index = Integer.parseInt(comTwo[2]);
                if (index < strList.size()) {
                    strList.add(index, elem);
                }
            }
        }
        System.out.println(strList.toString().replaceAll("[\\[\\],]", ""));
    }
}

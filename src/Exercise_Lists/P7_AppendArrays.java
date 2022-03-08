package Exercise_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> listSeparateByPipe = Arrays
                .stream(input.split(" \\|"))
                .collect(Collectors.toList());

        Collections.reverse(listSeparateByPipe);
        System.out.println(listSeparateByPipe.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));


    }
}

package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3 3 6 1
        List<Double> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i).equals(numList.get(i + 1)));

        }

    }
}

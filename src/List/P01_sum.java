package List;

import java.text.DecimalFormat;
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
        for (int i = 0; i < numList.size() - 1; i++) {
            if (numList.get(i).equals(numList.get(i + 1))) {
                numList.set(i, numList.get(i) + numList.get(i + 1));
                numList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numList, " "));
    }


    public static String joinElementsByDelimiter(List<Double> List, String delimiter) {
        String output = "";
        for (Double items : List) {
            DecimalFormat df = new DecimalFormat("0.#");
            String numDf = df.format(items) + delimiter;
            output += numDf;
        }
        return output;

    }
}

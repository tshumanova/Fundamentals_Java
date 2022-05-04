package Associative_Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Т01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> countNumbersMap = new HashMap<>();
        for (int i = 0; i < numbersList.size(); i++) {

        }


    }
}

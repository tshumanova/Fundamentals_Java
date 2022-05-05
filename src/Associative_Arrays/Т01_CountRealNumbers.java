package Associative_Arrays;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Т01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> countNumbersMap = new TreeMap<>();

        for (int i = 0; i < numbersList.size(); i++) {
            double currentNumber = numbersList.get(i);
            if (countNumbersMap.containsKey(currentNumber)) {
                countNumbersMap.put(currentNumber, countNumbersMap.get(currentNumber) + 1);
            } else {
                countNumbersMap.put(currentNumber,1);
            }
        }


    }
}

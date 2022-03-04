package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombPower = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        while (sequence.contains((bombPower[0]))) {
            int bomb = bombPower[0];
            int power = bombPower[1];
            int indexBomb = sequence.indexOf(bomb);
            int[] powerScope = checkStartAndFinish(sequence, power, indexBomb);
            sequence.subList(powerScope[0], powerScope[1] + 1).clear();
        }
        int sum = 0;
        for (Integer integer : sequence) {
            sum += integer;
        }
        System.out.println(sum);
    }

    private static int[] checkStartAndFinish(List<Integer> sequence, int power, int indexBomb) {
        int[] scope = new int[2];
        int first = indexBomb - power;
        int last = indexBomb + power;
        if (first >= 0) {
            scope[0] = first;
        }
        if (last > sequence.size() - 1) {
            scope[1] = sequence.size() - 1;
        } else {
            scope[1] = last;
        }
        return scope;
    }
}

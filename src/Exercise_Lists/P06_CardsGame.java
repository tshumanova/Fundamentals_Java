package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstPlayerCards.size() != 0 && secondPlayerCards.size() != 0) {
            int firstPlayerCard = firstPlayerCards.get(0);
            int secondPLayerCard = secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);

            if (firstPlayerCard > secondPLayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPLayerCard);
            } else if (secondPLayerCard > firstPlayerCard) {
                secondPlayerCards.add(secondPLayerCard);
                secondPlayerCards.add(firstPlayerCard);
            }
        }
        if (firstPlayerCards.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayerCards));
        } else if (secondPlayerCards.size() == 0) {
            System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayerCards));
        }
    }

    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card : listCards) {
            sum += card;
        }
        return sum;
    }
}

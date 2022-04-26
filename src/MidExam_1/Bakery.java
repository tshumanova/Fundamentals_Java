package MidExam_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> foodInfo = new LinkedHashMap<>();
        Map<String, Integer> foodSell = new TreeMap<>();
        int allSold = 0;

        while (!input.equals("Complete")) {
            String[] text = input.split(" ");
            String command = text[0];
            switch (command) {
                case "Receive":
                    int quantity = Integer.parseInt(text[1]);
                    String food = text[2];
                    if (foodInfo.containsKey(food) && quantity > 0) {
                        int newQuantity = foodInfo.get(food) + quantity;
                        foodInfo.put(food, quantity);
                    } else if (quantity > 0) {
                        foodInfo.put(food, quantity);
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Sell":
                    int wantedQuantity = Integer.parseInt(text[1]);
                    String wantedFood = text[2];

                    if (foodInfo.containsKey(wantedFood)) {
                        if (wantedQuantity <= foodInfo.get(wantedFood)) {
                            foodSell.put(wantedFood, wantedQuantity);
                            foodInfo.put(wantedFood, foodInfo.get(wantedFood) - wantedQuantity);
                            if (foodInfo.get(wantedFood) == 0) ;
                            {
                                foodInfo.remove(wantedFood);
                            }
                        }
                    }

                    input = scanner.nextLine();
            }
        }

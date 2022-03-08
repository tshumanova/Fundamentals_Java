package Exercise_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int capacity = Integer.parseInt(scanner.nextLine());
        List<Integer> train = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            train.add(Integer.parseInt(input[i]));
        }
        while (!input[0].equals("end")) {
            if (!input[0].equals("end")) {
                input = scanner.nextLine().split(" ");
            } else {
                break;
            }
            if (input[0].equals("Add")) {
                train.add(Integer.parseInt(input[1]));
            } else if (!input[0].equals("end")) {
                for (int i = 0; i < train.size(); i++) {
                    int sum = train.get(i) + Integer.parseInt(input[0]);
                    if (capacity >= sum) {
                        train.set(i, sum);
                        break;
                    }
                }
            }
        }
        for (int var : train) {
            System.out.print(var + " ");
        }
    }
}
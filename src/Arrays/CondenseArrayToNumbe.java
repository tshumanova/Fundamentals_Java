package Arrays;

import java.util.Scanner;

public class CondenseArrayToNumbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers= scanner.nextLine();
        String[]numbersAsString=lineOfNumbers.split("\\s+");

        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int repetition = 0; repetition <numbers.length-1 ; repetition++) {
            for (int i = 0; i <numbers.length-1 ; i++) {
                numbers[i]=numbers[i]+numbers[i+1];
            }
        }
        System.out.println(numbers[0]);
    }
}

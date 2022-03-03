package Exercise_Methods;

import java.util.Scanner;

public class P09_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        long factorial1 = calculateFactorial(number1);
        long factorial2 = calculateFactorial(number2);
        double result = factorial1 * 1.0 / factorial2;
        System.out.printf("%.2f", result);
    }

    static long calculateFactorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

package Basic;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int sumOddNumber=0;
        for (int i = 1; i <=n ; i++) {
            System.out.println(number);
            sumOddNumber +=number;
            number+=2;
        }


        System.out.printf("Sum: %d", sumOddNumber);
    }
}

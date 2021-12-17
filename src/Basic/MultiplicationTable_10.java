package Basic;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        //{theInteger} X {times} = {product}
        for (int i = 1; i <=10 ; i++) {
            int product=number*i;
            System.out.printf("%d X %d = %d\n",number,i,product);

        }

    }
}

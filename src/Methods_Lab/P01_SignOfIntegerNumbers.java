package Methods_Lab;

import java.util.Scanner;

public class P01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        printSing(Integer.parseInt(scanner.nextLine()));
    }

    private static void printSing(int number) {
        if(number>0){
            System.out.printf("The number %d is positive.",number);
        }
    }
}

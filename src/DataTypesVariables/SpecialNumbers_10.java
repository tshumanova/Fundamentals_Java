package DataTypesVariables;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int num = 1; num <= number; num++) {
            int sumOfDigits =0;
            int digits=num;
           while(digits>0) {
               sumOfDigits += digits % 10;
               digits = digits / 10;
           }
           if(sumOfDigits==5 ||sumOfDigits==7 || sumOfDigits==11){
               System.out.printf("%d -> True\n",num);
           }else{
               System.out.printf("%d -> False\n",num);
           }
        }
    }
}

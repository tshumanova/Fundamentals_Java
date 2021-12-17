package Basic;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfDay = scanner.nextLine().toLowerCase();
        double age = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (typeOfDay.equals("weekday")) {
            if (age >= 0 && age <=18 || age > 64 && age <= 122) {
                price = 12;
                System.out.printf("%.0f$", price);
            } else if (age > 18 && age <= 64) {
                price = 18;
                System.out.printf("%.0f$", price);
            } else {
                System.out.println("Error!");
            }

        } else if (typeOfDay.equals("weekend")) {
            if (age >= 0 && age <=18 || age > 64 && age <= 122) {
                price = 15;
                System.out.printf("%.0f$", price);
            } else if (age > 18 && age <= 64) {
                price = 20;
                System.out.printf("%.0f$", price);
            } else {
                System.out.println("Error!");
            }


        } else if (typeOfDay.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
                System.out.printf("%.0f$", price);
            } else if (age > 18 && age <= 64) {
                price = 12;
                System.out.printf("%.0f$", price);
            } else if (age > 64 && age <= 122) {
                price = 10;
                System.out.printf("%.0f$", price);
            } else {

                System.out.println("Error!");
            }
        } else{
            System.out.println("Error!");
        }

    }
}

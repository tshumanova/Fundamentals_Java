package Exercise_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double lightsabers = 1;
        lightsabers = Math.ceil((numberOfStudents * lightsabers) + ((numberOfStudents * lightsabers) * 0.1));
        double belts = numberOfStudents;
        double beltsAgain = belts;
        double robes = numberOfStudents;

        while (beltsAgain >= 6) {
            belts--;
            beltsAgain -= 6;
        }

        double totalPrice = (lightsaberPrice * lightsabers) + (beltsPrice * belts) + (robes * robesPrice);

        if (money >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);

        } else {
            double neededMoney = totalPrice - money;
            System.out.printf("George Lucas will need %.2flv more.",neededMoney);

        }
    }
}


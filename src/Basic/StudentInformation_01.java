package Basic;

import java.util.Scanner;

public class StudentInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double grade = Double.parseDouble(scanner.nextLine());
        if (grade >= 3.00) {
            System.out.print("Passed!");
        }
    }

}

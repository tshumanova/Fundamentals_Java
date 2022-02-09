package Methods_Lab;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printInWords(Double.parseDouble(scanner.nextLine()));
    }

    private static void printInWords(double grade) {
        String gradeImWords = "";
        if (grade >= 2 && grade <= 2.99) {
            gradeImWords = "Fail";
            System.out.println(gradeImWords);
        } else if (grade >= 3.00 && grade <= 3.49) {
            gradeImWords = "Poor";
            System.out.println(gradeImWords);
        } else if (grade >= 3.50 && grade <= 4.49) {
            gradeImWords = "Good";
            System.out.println(gradeImWords);
        } else if (grade >= 4.50 && grade <= 5.49) {
            gradeImWords = "Very good";
            System.out.println(gradeImWords);
        } else if (grade >= 5.50 && grade <= 6.00) {
            gradeImWords = "Excellent";
            System.out.println(gradeImWords);
        }

    }
}

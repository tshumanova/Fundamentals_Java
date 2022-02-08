package Methods_Lab;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printInWords(Double.parseDouble(scanner.nextLine()));
    }

    private static void printInWords(double grade) {
        String gradeImWords = "";
        if(grade>=2 && grade<=2.99){
            gradeImWords="Fail";
        }
        System.out.println(gradeImWords);
    }

}

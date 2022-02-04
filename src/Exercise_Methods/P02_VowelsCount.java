package Exercise_Methods;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printVowelsCount(text);
    }

    public static void printVowelsCount(String text){
        for(int i=0;i<text.length();i++){
            char symbol=text.toLowerCase().charAt(i);
        }
    }

}
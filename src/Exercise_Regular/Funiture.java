package Exercise_Regular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Funiture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("[>]{2}(?<name>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)");


    }
}

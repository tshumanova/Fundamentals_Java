package Exercise_Regular;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SoftUniBarlncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<product>\\w+)>[^|$.]*?\\|(?<count>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d+)\\$");
        double income = 0;
        String line = scanner.nextLine();



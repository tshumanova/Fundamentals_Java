package Methods_Lab;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = calcRectangleArea(width, height);
        System.out.printf("%.0f%n", area);
    }

    private static double calcRectangleArea(double width, double height) {
        return width * height;
    }
}

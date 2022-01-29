package Array_Exercise;


import java.util.Arrays;
import java.util.Scanner;

public class P10_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fielSize=Integer.parseInt(scanner.nextLine());
        int [] bugPositions= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[]field=new int[fielSize];



    }
}

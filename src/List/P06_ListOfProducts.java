package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> listProducts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            listProducts.add(product);

        }
        Collections.sort(listProducts);

        for (int i = 0; i < listProducts.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, listProducts.get(i));
        }

    }
}

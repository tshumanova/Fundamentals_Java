package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var productsInStock = new ArrayList<Product>();
        // var commands = new ArrayList<String>();
        ////  List<String> commands = Arrays
//                .stream(scanner.nextLine().split(" "))
//                .collect(Collectors.toList());
        var soldUnits = 0;
        List<String> commands = new ArrayList<>();

        for (int i = 0; i <9999; i++) {
            String product = scanner.nextLine();
            commands.add(product);
            if (product.equals("Complete")) {
                break;
            }
        }

        for (var command : commands) {
            if (command.strip().equals("Complete")) {
                for (int i = 0; i < productsInStock.size(); i++) {
                    if (productsInStock.get(i).getUnits() == 0) {
                        continue;
                    }

                    System.out.println(String.format("%1$s: %2$s", productsInStock.get(i).getProductName(), productsInStock.get(i).getUnits()));
                }

                System.out.println(String.format("All sold: %1$s goods", soldUnits));
                break;
            }

            var splittedCommand = command.split("[ ]", -1);

            if (splittedCommand[0].equals("Receive")) {
                boolean found = false;

                for (int i = 0; i < productsInStock.size(); i++) {
                    if (productsInStock.get(i).getProductName().equals(splittedCommand[2])) {
                        productsInStock.get(i).setUnits(productsInStock.get(i).getUnits() + Integer.parseInt(splittedCommand[1]));
                        found = true;
                    }
                }

                if (!found) {
                    Product tempVar = new Product();
                    tempVar.setProductName(splittedCommand[2]);
                    tempVar.setUnits(Integer.parseInt(splittedCommand[1]));
                    productsInStock.add(tempVar);
                }

            } else {
                boolean found = false;
                var stock = new Product();

                for (int i = 0; i < productsInStock.size(); i++) {
                    if (productsInStock.get(i).getProductName().equals(splittedCommand[2])) {
                        found = true;
                        stock = productsInStock.get(i);
                    }
                }

                if (!found) {
                    System.out.println(String.format("You do not have any %1$s.", splittedCommand[2]));
                    continue;
                }


                if (stock.getUnits() - Integer.parseInt(splittedCommand[1]) < 0) {
                    System.out.println(String.format("There aren't enough %1$s. You sold the last %2$s of them.", splittedCommand[2], splittedCommand[1]));
                    stock.setUnits(0);
                    soldUnits += Integer.parseInt(splittedCommand[1]);
                } else if (stock.getUnits() == 0) {
                    System.out.println(String.format("You do not have any %1$s.", stock.getProductName()));
                } else {
                    System.out.println(String.format("You sold %1$s %2$s.", splittedCommand[1], splittedCommand[2]));
                    stock.setUnits(stock.getUnits() - Integer.parseInt(splittedCommand[1]));
                    soldUnits += Integer.parseInt(splittedCommand[1]);
                }
            }

        }
    }


    public static class Product {
        private String ProductName;

        public final String getProductName() {
            return ProductName;
        }

        public final void setProductName(String value) {
            ProductName = value;
        }

        private int Units;

        public final int getUnits() {
            return Units;
        }

        public final void setUnits(int value) {
            Units = value;
        }
    }
}

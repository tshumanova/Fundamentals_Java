package MidExam_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2_TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] cars = input.split(">>");
        List<Vehicle> convertedVehicles = new ArrayList<Vehicle>();
        for (var car : cars) {
            var splitCar = car.split(" ");
            var vehicleType = new Vehicle();
            vehicleType.setVehicletype(splitCar[0]);
            vehicleType.setYears(Integer.parseInt(splitCar[1]));
            vehicleType.setKilometers(Integer.parseInt(splitCar[2]));
            convertedVehicles.add(vehicleType);
        }
        double totalTax = 0;
        for (var convertedVehicle : convertedVehicles) {
            if (convertedVehicle.getVehicletype().equalsIgnoreCase("family")) {
                double yearsDeduction = convertedVehicle.getYears() * 5;
                double kilometarsCharch = (convertedVehicle.getKilometers() / 3000) * 12;
                double totalFamilyTax = (50 - yearsDeduction + kilometarsCharch);
                totalTax = totalTax + totalFamilyTax;
                System.out.printf("A family car will pay %.2f euros in taxes.\n", totalFamilyTax);
            } else if (convertedVehicle.getVehicletype().equalsIgnoreCase("heavyDuty")) {
                double yearsDeduction = convertedVehicle.getYears() * 8;
                double kilometarsCharch = (convertedVehicle.getKilometers() / 9000) * 14;
                double totalFamilyTax = (80 - yearsDeduction + kilometarsCharch);
                totalTax = totalTax + totalFamilyTax;
                System.out.printf("A heavyDuty car will pay %.2f euros in taxes.\n", totalFamilyTax);
            } else if (convertedVehicle.getVehicletype().equalsIgnoreCase("sports")) {
                double yearsDeduction = convertedVehicle.getYears() * 9;
                double kilometarsCharch = (convertedVehicle.getKilometers() / 2000) * 18;
                double totalFamilyTax = (100 - yearsDeduction + kilometarsCharch);
                totalTax = totalTax + totalFamilyTax;
                System.out.printf("A sports car will pay %.2f euros in taxes.\n", totalFamilyTax);
            } else {
                System.out.println("Invalid car type.");
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTax);
    }

    public static class Vehicle {
        private String Vehicletype;

        public final String getVehicletype() {
            return Vehicletype;
        }

        public final void setVehicletype(String value) {
            Vehicletype = value;
        }

        private int Years;

        public final int getYears() {
            return Years;
        }

        public final void setYears(int value) {
            Years = value;
        }

        private int Kilometers;

        public final int getKilometers() {
            return Kilometers;
        }

        public final void setKilometers(int value) {
            Kilometers = value;
        }


    }

}


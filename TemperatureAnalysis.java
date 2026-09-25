//Daily Temperature Min/Max Identification

import java.util.Scanner;

public class TemperatureAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of days.");
            scanner.close();
            return;
        }

        double[] temperatures = new double[n];
        System.out.println("Enter temperature recordings:");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        double maxTemp = temperatures[0];
        double minTemp = temperatures[0];

        for (int i = 1; i < n; i++) {
            if (temperatures[i] > maxTemp) maxTemp = temperatures[i];
            if (temperatures[i] < minTemp) minTemp = temperatures[i];
        }

        System.out.println("\n--- Temperature Summary ---");
        System.out.println("Highest Temperature: " + maxTemp + "°C");
        System.out.println("Lowest Temperature:  " + minTemp + "°C");

        scanner.close();
    }
}
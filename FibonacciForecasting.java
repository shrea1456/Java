//Fibonacci Series Forecasting Module

import java.util.Scanner;

public class FibonacciForecasting {
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        long first = 0, second = 1;
        System.out.print("Fibonacci Series (" + n + " terms): ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + (i == n ? "" : ", "));
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of periods/terms to simulate: ");
        int terms = scanner.nextInt();

        printFibonacci(terms);
        scanner.close();
    }
}
//Odd but Non-Prime Numbers (1 to 50)

public class OddNonPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Odd and non-prime numbers between 1 and 50:");
        for (int i = 1; i <= 50; i++) {
            // Check if the number is odd and NOT prime
            if (i % 2 != 0 && !isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
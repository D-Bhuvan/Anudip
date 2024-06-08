package Samplepackage;
public class PrimeNumberSeries {

    public static void main(String[] args) {
        int limit = 50; // Set the limit up to which you want to find prime numbers

        System.out.println("Prime numbers up to " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

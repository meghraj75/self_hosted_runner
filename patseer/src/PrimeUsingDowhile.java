import java.util.Scanner;

public class PrimeUsingDowhile {
    public static void main(String[] args) {

        int num = 2;  // Starting number
        System.out.println("Prime numbers between 1 and 100 are:");

        do {
            boolean isPrime = true;

            // Check if num is divisible by any number between 2 and sqrt(num)
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;  // If num is divisible, it's not prime
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.print(num + " ");  // Print the prime number
            }

            num++;  // Move to the next number
        } while (num <= 100);  // Loop through numbers up to 100
    }
}
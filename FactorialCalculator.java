import java.util.Scanner;

public class FactorialCalculator {
    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return number;
    }

    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1; // Factorial of 0 is 1
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Main method
    public static void main(String[] args) {
        int number = getNonNegativeInteger(); // Get user input
        long factorial = calculateFactorial(number); // Calculate factorial
        System.out.println("The factorial of " + number + " is: " + factorial); // Display result
    }
}
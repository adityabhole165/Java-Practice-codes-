import java.util.Scanner; // Import Scanner class for user input

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Take integer input from user

        int square = num * num; // Step 1: Find square of the number
        int sum = 0; // Step 2: Initialize sum to 0

        // Step 3: Loop to extract digits from square
        while (square > 0) {
            int digit = square % 10; // Get last digit
            sum += digit;            // Add to sum
            square = square / 10;    // Remove last digit
        }

        // Step 4: Compare sum with original number
        if (sum == num)
            System.out.println(num + " is a Neon Number.");
        else
            System.out.println(num + " is NOT a Neon Number.");

        sc.close(); // Close the scanner (good practice)
    }
}

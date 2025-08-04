public class printReverse2 {
    // Reverse Number Approach 2 -  Reconstruct Reversed Integer
    public static void main(String args[]) {
        int number = 54687;
        int rev = 0;
        
        while(number  > 0) {
            int last  = number % 10;
            rev = (rev * 10) + last;
            number /= 10;
        }
        System.out.print(rev);
    }
}
//  What it does:

// Builds the reversed number using math

// Stores it in rev

//  Output: 654321 (as an integer)

// Best Use Case: When you need the reversed number in later logic or computation.

// Time Complexity: O(log₁₀ n)
//  Space Complexity: O(1)
// Most efficient overall (no string operations, memory-optimal)
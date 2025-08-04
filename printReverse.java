public class printReverse{
    // Reverse the Number first Approach
    public static void main(String args[]) {
        int n = 123456;
        while(n > 0) {
            int last  = n%10;
            System.out.print(last);
            n = n/10;
        }
    }
}

// What it does:

// Extracts digits one by one using % and /

// Prints each digit immediately

// Output: 654321 (digits printed in reverse)

// ⚡ Use case: Quick reverse display without storing the result!
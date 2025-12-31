public class patr {

    /**
     * Utility to repeat a character 'ch' count times and return the string.
     */
    private static String repeat(char ch, int count) {
        // Using StringBuilder for efficiency when building strings in a loop
        StringBuilder sb = new StringBuilder(count);
        for (int k = 0; k < count; k++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * Prints the desired pattern:
     * - First 'm' lines containing a single star ("*")
     * - Then for i = 2..n:
     *     print a line with i stars
     *     print a line with 1 star
     *
     * For example if m = 3 and n = 4, output will match the example you gave.
     */
    public static void printPattern(int m, int n) {
        // Validate inputs (defensive programming)
        if (m < 0 || n < 1) {
            throw new IllegalArgumentException("m must be >= 0 and n must be >= 1");
        }

        // Step 1: print 'm' single-star lines
        for (int i = 0; i < m; i++) {
            System.out.println("*");
        }

        // Step 2: for i = 2 to n, print i stars then a single-star line
        for (int i = 2; i <= n; i++) {
            System.out.println(repeat('*', i)); // a line with 'i' stars, e.g. "**", "***", ...
            System.out.println("*");            // a line with exactly one star
        }
    }

    public static void main(String[] args) {
        // Example parameters that reproduce your provided pattern:
        int m = 3; // number of initial single-star lines
        int n = 4; // maximum multi-star line length

        printPattern(m, n);

        // If you want to try other sizes, change m and n above.
        // For instance:
        // printPattern(0, 5); // starts directly from "**" then "*", "***" then "*", ...
    }
}

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
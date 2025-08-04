public class printReverse3 {
    public static int ReverseNumber(int num) {
        //convert number to String
        String NumStr = String .valueOf(num);

        // create String Buffer Object
        StringBuffer sb = new StringBuffer(NumStr);

        // Reverse the String
        sb.reverse();

        // Return the number by Converting to the Integer Datatype
        return Integer.parseInt(sb.toString());
    }
    
    public static void main(String args[]) {
        int num = 12345;
        int Reverse = ReverseNumber(num);
        System.out.print("Reverse Number = " + Reverse);
    }
}

// Converts number to string

// Reverses it with built-in reverse()

// Converts back to int

// Output: 654321 (as an integer)

// Best Use Case: When working with string manipulation or for quick readability.

// Time Complexity: O(n) where n = number of digits
//  Space Complexity: O(n) due to string/objects
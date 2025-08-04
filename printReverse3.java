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
public class ArayStr{
    public static void main(String args[]){
        // Declaration and Initializtion of array

        int Numbers[] = new int[4];
        Numbers[0] = 10;
        Numbers[1] = 15;
        Numbers[2] = 95;
        Numbers[3] = 25;

    // Printing Arrays
        for(int i =0; i < Numbers.length; i++) {
            System.out.print(Numbers[i] +" , ");
        }


        // String 

        String name = "Aditya" ;

        // Accessing characters
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() -1));
    }
}
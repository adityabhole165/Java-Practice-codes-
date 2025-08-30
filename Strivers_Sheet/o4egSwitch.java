public class o4egSwitch{
    public static void main(String args[]) {
        int day = 2;

        // Duplicate Case = gives error as Duplicate Case  
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2 : 
                System.out.println("Tuesday");
                break;
            case 2 : 
                System.out.println("Duplicate case ");
                break;

            dafault :
                System.out.println("Invalid day");
        }
    }

}
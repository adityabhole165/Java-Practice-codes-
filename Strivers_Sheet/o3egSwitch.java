public class o3egSwitch{
    public static void main(String args[]){
        char grade ='B';

        // char datatype as a switch Condition
        switch( grade ) {
            case 'A' :
                System.out.println(" Excellent !");
                break;
            case 'B' :
                System.out.println("Good");
                break;
            default:
                System.out.println("Not Found");
        }
    }
}
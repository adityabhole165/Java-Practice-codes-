// Diamond Pattern  = Triangle Pattern + Inverted Triangle Pattern
public class stpatrn9{
    public static void main(String args[]){
        int n = 5;
        // Triangle pattern
        for(int i = 0; i< n ; i++){
            for(int j =0; j <( n-i)+1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <(2*i) +1 ; j++){
                System.out.print("*");
            }
            for(int j =0; j< (n-i)+1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        // inverted triangle pattern 
        for(int i= n-1; i>=0; i--){
            for(int j =0; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < ((2*i) +1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < n-i+1 ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
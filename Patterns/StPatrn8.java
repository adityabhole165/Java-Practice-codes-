public class stPatrn8{
    public static void main(String args[]){
        int n =5;
        // inverted Triangle pattern
        for(int i = n-1; i>=0; i--){
            for(int j =0; j< n-i; j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+ 1 ; j++){
                System.out.print("*");
            }
            for(int j =0 ; j< n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
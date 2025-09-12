import java.util.Scanner;

public class StriPatrn1{
    public static void Pattern1(int n){
         // pattern 1
        for( int i = 0 ; i < n ; i++) {
            for(int j = 0; j< n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        Pattern1(n);
    }
}
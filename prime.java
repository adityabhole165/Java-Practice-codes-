import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int count = 0;
        int n= 10;
      for(int m =0; m< n ; m++)
      {  if(n <= 1) {
            isPrime = false;
        } else {
            for(int i =2; i <= Math.sqrt(n) ; i++) {
                if(n % i == 0)
                {
                    isPrime = false;
                    System.out.print("Not prime");
                    break;
                }
                count++;
                System.out.println(count);
            }
        }}

        if(isPrime == true) {
            System.out.println(n + "is Prime");
        }
        else {
            System.out.println(n + " is not prime");
        }
    }
}
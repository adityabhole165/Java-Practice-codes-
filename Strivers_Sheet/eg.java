import java.util.*;
public class eg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Ans1 = calculate(num);
        if( Ans1 >= 10) {
            int Ans2  =  calculate(Ans1);
            System.out.println(Ans2);
        } else {
            System.out.println(Ans1);
        }

    }

    static int calculate(int num) {
        int last =0;
        while(num > 10) {
            last = num % 10 ; 
            break;
        }
        num = num /10;
        int Sum = num + last;
        return Sum;
    }
}
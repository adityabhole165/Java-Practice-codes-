import java .util.Scanner;
public class ary2{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
    int numbers[ ] = new int[3];
        // input
        for(int i = 0 ; i<3; i++){
            numbers[i] = sc.nextInt();
        }

        int  x = sc.nextInt();
        // output
        for(int i = 0; i < 3; i++){
            if(numbers[i] == x){
                System.out.print("x found at index i"+i);
            }
            // System.out.print(numbers[i]+ " ,");
        }

    }
}
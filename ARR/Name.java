import java.util.*;
public class Name{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr[] =  new String[3];
        // input 
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.next();
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
    }
}
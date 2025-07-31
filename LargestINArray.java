import java.util.*;
public class LargestINArray{
    public static int LargestNum( int arr[]) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i]; 
            }
        }

        return largest;
    }

    public static void main(String args []) {
        int arr[] = { 1,2,6,4,8,44};
        System.out.print("Largest = " + LargestNum(arr));
    }
}
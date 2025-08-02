import java.util.*;
public class  countingSorting {
    public static void count(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int counting[] = new int[largest + 1 ] ;
        for(int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }

        int j =0;
        for(int i =0; i < counting.length ; i++) {
            while(counting[i] > 0) {
                arr[j] = i;
                j++;
                counting[i]--;
            }
        }


    }
    public static void main(String args[]) {
        int arr[] = {1,6,5,8,7,6,10};
        count(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for( int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
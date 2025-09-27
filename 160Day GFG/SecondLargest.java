import java.util.Arrays;
class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);

        
        if(arr[arr.length -1] == arr[arr.length-2]){
            return  -1;
        }
        
        return arr[arr.length-2];
    }
    public static void main(String args[]){
        int[] arr = {5, 2, 9, 1, 9};
        System.out.println(getSecondLargest(arr));

    }

}
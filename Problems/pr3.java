public class pr3{
    public static void pairSum(int n , int target, int[] arr){
        int left = 0;
        int right = n-1;

        while(left < right){
            int sum = arr[left] + arr [right];

            if( sum == target){
                System.out.println(arr[left] + " "+ arr[right]);
                return;
            } else if( arr[left]+arr[right] < target){
                left++;
            } else{
                right--;
            }
        }
        System.out.println("-1 -1");
    }
    public static void main(String args[]){
        int[] arr = {};
        pairSum(1, 2, arr);
    }

}
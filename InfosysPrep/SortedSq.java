public class SortedSq{
    public static int[] sortedSquareArr(int arr[]){
        int n= arr.length;
        int[] result= new int[n];
        int left = 0;
        int right = n-1;
        int index = n-1;

        while(left <= right){
            int leftSq= arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if(leftSq > rightSq){
                result[index] = leftSq;
                left++;
            } else {
                result[index] = rightSq;
                right--;
            }
            index--;
        } 
        return result;
    }
    public static void main(String args[]){
        int arr[] = {-7,-3,2,3,11};
        int[] res = sortedSquareArr(arr);
        for(int num: res){
            System.out.print(num + " ");
        }
    }
}
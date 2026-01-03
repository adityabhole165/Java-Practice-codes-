public class substrK{
    public static int CalSubStr(int[] arr, int k){
        int left=0;
        int sum=0;
        int maxlen =0;

        for(int right=0; right < arr.length; right++){
            sum += arr[right];
            while(sum>k){
                sum -= arr[left];
                left++;
            }
            maxlen= Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
    public static void main(String args[]){
        int[] arr ={2, 1, 1, 1, 3, 2};
        System.out.println(CalSubStr(arr,4));
    }
}
public class insertionsort {
    public static  void insertion(int arr[]) {
        for(int i =1; i< arr.length; i++) {
            int curr = arr[i];
            int pre = i -1;

            while( pre >= 0 && arr[pre] > curr) {
                arr[pre +1 ] = arr[pre];
                pre--; 
            }

            arr[pre +1] = curr;
        }
    }
    public static void  printData(int arr[] ) {
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[]=  { 8,4,6,7,2,1,3,5 };
        insertion(arr);
        printData(arr);
    }
}
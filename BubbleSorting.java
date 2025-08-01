public class BubbleSorting {
    public static void BubbleSort(int arr[]) {
        int n = arr.length;
        boolean swaped;

        for(int i = 0; i< n-1; i++) {
            swaped = false;
            for(int j = 0; j< n-i-1; j++) {
                if(arr[j] > arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swaped = true;
            }
        }
            if(!swaped) {
                break;
            }
        }

    }
    public static void main(String args[]) {
        int arr[] = {1,6,5,8,7,6,10};
        BubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for( int i = 0 ; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class SelectionSOrt{
    public static void Selection(int arr[]) {
        for(int i =0; i < arr.length - 1; i ++) {
            int minPos = i;
            for( int j = i+1; j < arr.length; j ++) {
                if(arr[minPos] < arr[j]) {
                    minPos = j;
                }
            //swaped
            int temp = arr[minPos];
            arr[minPos] = arr[j];
            arr[j] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {2,3,4,63,56,29};
        Selection(arr);
        printArrs(arr);
    }
    public static void printArrs(int arr [] ) {
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
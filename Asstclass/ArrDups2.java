public class ArrDups2 {
    public static void main(String[] args) {
        // Step 1: Define an array
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        System.out.println("Duplicate elements in the array are:");

        // Step 2: Outer loop picks one element
        for (int i = 0; i < arr.length; i++) {

            // Step 3: Inner loop compares it with all next elements
            for (int j = i + 1; j < arr.length; j++) {

                // Step 4: Check if both elements are equal
                if (arr[i] == arr[j]) {

                    // Step 5: Print the duplicate element
                    System.out.println(arr[j]);
                    break; // To avoid printing same duplicate multiple times
                }
            }
        }
    }
}

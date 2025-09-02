public class loopOpti{
    public static void main(String args[]) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;

        // using break to exit the loop early when the target is found

        for(int num: numbers){
            if(num == target) {
                System.out.println("Target Found : " + target);
                break; //Exit the loop immediatly
            }
            System.out.println("Checking : " + num );
        }

        // Using Continue

        for(int num : numbers ) {
            if( num % 2  == 0){
                continue;  // skip even numbers 
            }
            System.out.println("Odd numbers :" + num);
        }

        

    }
}
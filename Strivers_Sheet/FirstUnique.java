public class FirstUnique {

    public static void firstUniqChar(String s1) {
        // char first =  s1.charAt(0)
        int count = 0;
        for( int i = 0 ; i < s1.length()-1; i++) {
            if(  s1.charAt(i) == s1.charAt(i+1)){
                count ++;
                System.out.println(s1.charAt(i) +" "+ s1.charAt(i+1));
            }
        }
        System.out.println("Count"+ count);
    
    }
    public static void main(String[] args) {
        String s1 = "leetcode";
        
        firstUniqChar(s1);

        // String s2 = "loveleetcode";
        // System.out.println("Input: " + s2);
        // System.out.println("Output: " +firstUniqChar(s2));

        // String s3 = "aabb";
        // System.out.println("Input: " + s3);
        // System.out.println("Output: " + firstUniqChar(s3));
}

}
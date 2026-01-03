import java.util.*;

public class pract2{
    public static int lengthOfLongestSubStr(String s){
        Set<Character> set = new HashSet<>();
        int left =0;
        int maxLen =0;

        for(int right = 0; right <s.length(); right++){
            //if duplicate -> Shrink window from left
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            //add new Character
            set.add(s.charAt(right));

            //update max window size
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String args[]){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubStr(s));
    }
}
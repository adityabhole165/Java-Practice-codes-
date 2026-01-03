public class SubStrLen{
    public static int SubStrLenNonRepeat(String s){
        int left =0;
        int maxlen=0;
        int[] Freq = new int[256];

        for(int right =0; right<s.length(); right++ ){
            char ch = s.charAt(right);
            Freq[ch]++;

            //shrink
            while(Freq[ch]>1){
                Freq[s.charAt(left)]--;
                left++;
            }
            maxlen= Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
    public static void main(String args[]){
        System.out.println(SubStrLenNonRepeat("abcabcbb"));
    }
}
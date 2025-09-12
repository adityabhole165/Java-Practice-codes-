public class FirstUnique {

    public static int firstUniqChar(String s1) {
        
        char strArr[] = s1.toCharArray();
        int counter[] = new int[strArr.length];
        int ans = 0;
        for(int i =0; i < strArr.length; i++)
        {   
            counter[i] = 1;
            for(int j = i+1 ; j< strArr.length; j++){
                if(strArr[i] == strArr[j] ) {
                    counter[i]++;
                    strArr[j] = '0';
                }
            }
        }

        for(int i = 0; i < counter.length; i++){
            if(strArr[i] !=' ' && strArr[i]!='0'){
                if(counter[i] == 1 ) {
                    System.out.print(strArr[i]+" "+counter[i] +"  ");
                    ans = i;
                    System.out.println("  "+"ans" + ans);
                    // return i;
                } if(counter[i] > 2) {
                    return -1;
                }
            }
        }
        for(int i = 0; i < counter.length; i++){
            System.out.print("i = "+ i +" value = "+ counter[i]+ " ");
        }
    
        return -1;
    
    }
    public static void main(String[] args) {
        String s1 = "aabb";//output: -1
        String s2 = "loveleetcode";//output: 2
        String s3 = "leetcode" ; // output: 0
        System.out.println("Output " + firstUniqChar(s1));
    }
}


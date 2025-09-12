public class CharacterCounter {
    public static void countCharacterOccurrences(String str) {
        char[] charArray = str.toCharArray();
        int[] freq = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            freq[i] = 1; // Initialize frequency for current character

            // Inner loop to compare with subsequent characters
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    freq[i]++;
                    // Mark the visited character to avoid recounting
                    charArray[j] = '0'; // A placeholder character
                }
            }
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (charArray[i] != ' ' && charArray[i] != '0') {
                System.out.println(charArray[i] + " : " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        String testString = "hello world";
        countCharacterOccurrences(testString);
    }
}
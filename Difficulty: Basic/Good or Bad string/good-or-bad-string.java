class Solution {
    static int isGoodorBad(String S) {
        // code here
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '?') {
                // '?' could be either vowel or consonant
                vowel++;
                consonant++;

            } else if (isVowel(ch)) {
                vowel++;
                consonant = 0;

            } else {
                consonant++;
                vowel = 0;
            }

            // If either count exceeds the threshold, it's BAD
            if (vowel > 5 || consonant > 3) {
                return 0;
            }
        }

        return 1;
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';// code here
        
    }
};

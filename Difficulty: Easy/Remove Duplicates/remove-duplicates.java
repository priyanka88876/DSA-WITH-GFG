// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length();i++) {
            char ch = s.charAt(i);
            if(!seen[ch - 'a']) {
                seen[ch - 'a'] = true;
                result.append(ch);
            }
        }
        return result.toString();
    }
}
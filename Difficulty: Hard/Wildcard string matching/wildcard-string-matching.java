// User function Template for Java

class Solution {
    static boolean match(String wild, String pattern) {
        // code here
          int n = wild.length();
        int m = pattern.length();
        
        int i = 0, j = 0;
        int checkpointWild = -1, checkpointPattern = -1;

        while (j < m) {
            if (i < n && (wild.charAt(i) == pattern.charAt(j) || wild.charAt(i) == '?')) {
                i++;
                j++;
            } else if (i < n && wild.charAt(i) == '*') {
                checkpointWild = i;
                checkpointPattern = j;
                i++;
            } else if (checkpointWild != -1) {
                // Backtrack to the last '*' checkpoint
                i = checkpointWild + 1;
                j = checkpointPattern + 1;
                checkpointPattern++;
            } else {
                return false;
            }
        }

        while (i < n && wild.charAt(i) == '*') {
            i++;
        }
        return i == n;
    }
}
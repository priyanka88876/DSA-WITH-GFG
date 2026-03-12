
class Solution {
    static String longestPalindrome(String s) {
        // code here
        int n = s.length();
        if (n == 0) return "";
        
        boolean[][] dp = new boolean[n][n];
        int max = Integer.MIN_VALUE;
        int start = 0, end = 0;
        
        for(int g=0; g<n; g++) {
            for(int i=0, j=g; j<n; i++, j++) {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);
                
                if(g==0) {
                    dp[i][j] = true;
                } else if(g==1) {
                    if(ch1 == ch2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if(ch1==ch2) {
                        dp[i][j] = dp[i+1][j-1];
                    } else {
                        dp[i][j] = false;
                    }
                }
                
                if(dp[i][j] && j-i+1 > max) {
                    max = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        
        return s.substring(start, end+1);

    }
}
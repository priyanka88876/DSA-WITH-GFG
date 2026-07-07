class Solution {
    public int editDistance(String s1, String s2) {
        // code here
         int l1 = s1.length();
        int l2 = s2.length();
        
        int[][] dp = new int[l1 + 1][l2 + 1];
        
        // Base cases: filling the last row and last column
        for (int i = 0; i <= l1; i++) {
            dp[i][l2] = l1 - i;
        }
        for (int j = 0; j <= l2; j++) {
            dp[l1][j] = l2 - j;
        }
        
        // Iterative DP from bottom-right to top-left
        for (int i = l1 - 1; i >= 0; i--) {
            for (int j = l2 - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    int insert = 1 + dp[i][j + 1];
                    int remove = 1 + dp[i + 1][j];
                    int replace = 1 + dp[i + 1][j + 1];
                    
                    dp[i][j] = Math.min(insert, Math.min(remove, replace));
                }
            }
        }
        
        return dp[0][0];
    }
}

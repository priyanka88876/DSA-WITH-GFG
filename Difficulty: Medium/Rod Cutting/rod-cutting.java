class Solution {
    public int cutRod(int[] price) {
        // code here
          int n = price.length;
        
        int[][] dp = new int[n + 1][n + 1];
        
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                
                // this tells keep the profit 
                // till now excluding the current current length cut
                int ex = dp[i][j - 1];
                
                
                int in = 0;
                if(j <= i){
                    
                    // This tells add the current price and get the 
                    // profit before this state
                    
                    in = dp[i][j] = price[j - 1] + dp[i - j][j];
                    
                }
                
                dp[i][j] = Math.max(in, ex);
                
            }
        }
        return dp[n][n];

    }
}
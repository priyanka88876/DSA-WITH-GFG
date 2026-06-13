class Solution {
    public int countWays(int n) {
        // code here
           int dp[]=new int[n+1];
        return count(n,dp);
         }
    public  int count(int n,int dp[]){
         if(n==0 || n==1)
        {
            return 1;
        }
        if(dp[n]!=0)
        {
            return dp[n];
            
        }
        return dp[n]=count(n-1,dp)+count(n-2,dp);
    
    
    }
}
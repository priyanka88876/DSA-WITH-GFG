// User function Template for Java
class Solution {
    static long fibSum(long N) {
        // code here
                long first  = 0 ; 
        long second = 1 ; 
        long sum = 1; 
        
        if(N== 0 || N==1) return N ; 
        
        for(int i = 2 ; i<=N  ; i ++) {
            long temp= ( first + second ) % 1000000007 ; 
            sum+= temp; 
            first = second; 
            second =temp ; 
        }
        
        return  sum % 1000000007 ;

    }
}